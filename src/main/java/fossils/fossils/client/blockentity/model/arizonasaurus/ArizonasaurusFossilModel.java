package fossils.fossils.client.blockentity.model.arizonasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArizonasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Base;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart RightArm3;
	private final ModelPart RightArm4;
	private final ModelPart RightArmHand2;
	private final ModelPart LeftArm3;
	private final ModelPart LeftArm4;
	private final ModelPart LeftArmHand2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg3;
	private final ModelPart RLeg4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public ArizonasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Base = this.fossil.getChild("Base");
		this.Body = this.Base.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.RightArm3 = this.Body2.getChild("RightArm3");
		this.RightArm4 = this.RightArm3.getChild("RightArm4");
		this.RightArmHand2 = this.RightArm4.getChild("RightArmHand2");
		this.LeftArm3 = this.Body2.getChild("LeftArm3");
		this.LeftArm4 = this.LeftArm3.getChild("LeftArm4");
		this.LeftArmHand2 = this.LeftArm4.getChild("LeftArmHand2");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Head = this.Neck2.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.RLeg = this.Base.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RFoot = this.RLeg2.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg3 = this.Base.getChild("RLeg3");
		this.RLeg4 = this.RLeg3.getChild("RLeg4");
		this.RFoot3 = this.RLeg4.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
		this.Tail = this.Base.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Base = fossil.addOrReplaceChild("Base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.75F, 5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 61).addBox(0.0F, -1.599F, -0.2349F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8655F, 2.0189F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 61).addBox(-0.01F, 0.4134F, 0.707F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0655F, 2.2189F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 61).addBox(0.0F, -1.299F, -0.3349F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8655F, 0.6189F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Base.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 58).addBox(-0.01F, -1.1866F, 0.707F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0655F, 0.8189F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Base.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 56).addBox(0.0F, -3.299F, -0.3349F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8655F, -0.5811F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Base.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 58).addBox(-0.01F, -3.0866F, 0.007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0655F, -0.3811F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Base.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 56).addBox(-0.01F, -2.3477F, 0.8096F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9655F, -1.4811F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Base.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 45).addBox(0.0F, -4.299F, -0.3349F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8655F, -1.6811F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Base.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 28).mirror().addBox(-0.5F, -1.892F, 3.5804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.1172F, 1.1448F, -1.0841F, 0.0567F, -0.3033F));

		PartDefinition cube_r10 = Base.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-0.5F, -0.5386F, 1.9767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.1172F, 1.1448F, -0.735F, 0.0567F, -0.3033F));

		PartDefinition cube_r11 = Base.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 14).mirror().addBox(-0.5F, -0.2453F, 0.019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.1172F, 1.1448F, -0.5954F, 0.0567F, -0.3033F));

		PartDefinition cube_r12 = Base.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(27, 12).mirror().addBox(-0.5F, 3.1749F, -2.3399F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0325F, -0.317F, 0.0251F, 0.0098F, -0.2267F));

		PartDefinition cube_r13 = Base.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 32).mirror().addBox(-0.5F, 0.7939F, -1.6126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0325F, -0.317F, -0.1844F, 0.0098F, -0.2267F));

		PartDefinition cube_r14 = Base.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 0).mirror().addBox(-0.5F, -0.3225F, -0.792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0325F, -0.317F, -0.7778F, 0.0098F, -0.2267F));

		PartDefinition cube_r15 = Base.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.5F, -0.1F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 6).mirror().addBox(0.5F, 0.1F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 6).addBox(1.5F, 0.1F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(2.5F, -0.1F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(20, 32).addBox(1.0F, -0.1F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.5038F, -1.8255F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Base.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 47).mirror().addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(23, 47).addBox(2.5F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 0.7791F, 0.4447F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Base.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 12).addBox(-0.5F, 3.1749F, -2.3399F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 1.0325F, -0.317F, 0.0251F, -0.0098F, 0.2267F));

		PartDefinition cube_r18 = Base.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 32).addBox(-0.5F, 0.7939F, -1.6126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.4F, 1.0325F, -0.317F, -0.1844F, -0.0098F, 0.2267F));

		PartDefinition cube_r19 = Base.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, -0.3225F, -0.792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 1.0325F, -0.317F, -0.7778F, -0.0098F, 0.2267F));

		PartDefinition cube_r20 = Base.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(53, 28).addBox(-0.5F, -1.892F, 3.5804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.1172F, 1.1448F, -1.0841F, -0.0567F, 0.3033F));

		PartDefinition cube_r21 = Base.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 6).addBox(-0.5F, -0.5386F, 1.9767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.5F, 1.1172F, 1.1448F, -0.735F, -0.0567F, 0.3033F));

		PartDefinition cube_r22 = Base.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 14).addBox(-0.5F, -0.2453F, 0.019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.1172F, 1.1448F, -0.5954F, -0.0567F, 0.3033F));

		PartDefinition Body = Base.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2038F, -2.0255F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -1.5F, -4.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.01F))
				.texOffs(23, 25).addBox(-2.5F, -1.5F, -0.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.2867F, -4.2297F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 31).addBox(0.0F, -6.4212F, -1.4743F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 50).addBox(-0.01F, -12.3551F, 0.2154F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(45, 49).addBox(0.0F, -6.5432F, 3.1566F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(54, 37).addBox(-0.01F, -11.1572F, 1.239F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 46).addBox(0.0F, -7.3793F, 1.9637F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 28).addBox(-0.01F, -12.5013F, 0.6214F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(51, 50).addBox(-0.01F, -12.671F, 0.2595F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(17, 45).addBox(0.0F, -7.2571F, 0.8574F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(37, 45).addBox(0.0F, -7.3043F, -0.3625F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 52).addBox(-0.01F, -12.8999F, 0.7137F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(26, 52).addBox(-0.01F, -10.6938F, -2.3037F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(35, 54).addBox(0.0F, -5.195F, -3.6584F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(23, 52).addBox(0.0F, -5.79F, -2.5945F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 42).mirror().addBox(-4.1227F, -1.3681F, 3.5889F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.0587F, 0.1897F, -1.2664F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-5.0905F, -1.3771F, 1.5412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.0999F, 0.3144F, -1.2561F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 40).mirror().addBox(-5.5555F, -1.541F, -0.3893F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.0999F, 0.3144F, -1.2561F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-2.9674F, -0.3166F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.2251F, 0.2426F, -0.8081F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-3.3829F, 0.058F, 1.5412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.2251F, 0.2426F, -0.8081F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-3.4084F, 0.0798F, 3.5889F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.1338F, 0.1471F, -0.8258F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-3.2342F, -0.068F, 5.6341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.0711F, 0.0854F, -0.955F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(36, 22).mirror().addBox(-0.6774F, -0.9076F, 7.5649F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, -0.0952F, -0.0262F, -0.6782F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(18, 40).mirror().addBox(-1.2928F, 0.3769F, 5.6108F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.0992F, 0.0738F, -0.605F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(-1.3694F, 0.5689F, 3.5632F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.1792F, 0.1104F, -0.4757F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(-1.3162F, 0.5333F, 1.5163F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.2972F, 0.1695F, -0.4592F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-1.0191F, 0.0332F, -0.4076F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3226F, -8.4081F, 0.2943F, 0.1746F, -0.4762F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(48, 8).addBox(0.0191F, 0.0332F, -0.4076F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.2943F, -0.1746F, 0.4762F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 24).addBox(0.9674F, -0.3166F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.2251F, -0.2426F, 0.8081F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(26, 40).addBox(2.5555F, -1.541F, -0.3893F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.0999F, -0.3144F, 1.2561F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 18).addBox(3.0905F, -1.3771F, 1.5412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.0999F, -0.3144F, 1.2561F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(55, 10).addBox(1.3829F, 0.058F, 1.5412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.2251F, -0.2426F, 0.8081F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(47, 22).addBox(0.3162F, 0.5333F, 1.5163F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.2972F, -0.1695F, 0.4592F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 42).addBox(3.1227F, -1.3681F, 3.5889F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.0587F, -0.1897F, 1.2664F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(52, 4).addBox(1.4084F, 0.0798F, 3.5889F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.1338F, -0.1471F, 0.8258F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(44, 17).addBox(0.3694F, 0.5689F, 3.5632F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.1792F, -0.1104F, 0.4757F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(18, 40).addBox(0.2928F, 0.3769F, 5.6108F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.0992F, -0.0738F, 0.605F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(47, 0).addBox(1.2342F, -0.068F, 5.6341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, 0.0711F, -0.0854F, 0.955F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 22).addBox(-0.3226F, -0.9076F, 7.5649F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3226F, -8.4081F, -0.0952F, 0.0262F, 0.6782F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(3, 52).addBox(-0.01F, -12.0128F, -0.7684F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(54, 52).addBox(-0.01F, -9.3867F, -3.3059F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(20, 56).addBox(0.0F, -4.4675F, -4.738F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3644F, -4.4291F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, -0.3407F, -0.0619F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.286F, -8.88F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -8.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 54).addBox(-0.01F, -3.7F, -0.5145F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0122F, -1.2222F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(49, 58).addBox(0.0F, -2.7651F, -0.2519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1122F, -1.2222F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 28).addBox(-0.01F, -1.7F, -1.0145F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0122F, -2.1222F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(41, 60).addBox(0.0F, -1.7651F, -0.5519F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1122F, -2.1222F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -1.5942F, -0.4165F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1333F, -3.6612F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(6, 56).mirror().addBox(-4.5199F, -1.5519F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4226F, -1.5081F, 0.1201F, 0.4084F, -1.3799F));

		PartDefinition cube_r71 = Body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(13, 56).mirror().addBox(-2.9397F, -0.3416F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6226F, -3.5081F, 0.2856F, 0.3189F, -0.9223F));

		PartDefinition cube_r72 = Body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(38, 55).mirror().addBox(-2.9397F, -0.3416F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4226F, -1.5081F, 0.2856F, 0.3189F, -0.9223F));

		PartDefinition cube_r73 = Body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4226F, -1.5081F, 0.3795F, 0.2213F, -0.5742F));

		PartDefinition cube_r74 = Body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(59, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6226F, -3.5081F, 0.3795F, 0.2213F, -0.5742F));

		PartDefinition cube_r75 = Body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(57, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4226F, -1.5081F, 0.3795F, -0.2213F, 0.5742F));

		PartDefinition cube_r76 = Body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(6, 56).addBox(2.5199F, -1.5519F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4226F, -1.5081F, 0.1201F, -0.4084F, 1.3799F));

		PartDefinition cube_r77 = Body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 55).addBox(0.9397F, -0.3416F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4226F, -1.5081F, 0.2856F, -0.3189F, 0.9223F));

		PartDefinition cube_r78 = Body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(59, 15).addBox(2.5199F, -1.5519F, -0.4821F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6226F, -3.5081F, 0.1201F, -0.4084F, 1.3799F));

		PartDefinition cube_r79 = Body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(13, 56).addBox(0.9397F, -0.3416F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6226F, -3.5081F, 0.2856F, -0.3189F, 0.9223F));

		PartDefinition cube_r80 = Body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(59, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6226F, -3.5081F, 0.3795F, -0.2213F, 0.5742F));

		PartDefinition cube_r81 = Body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.2841F, -1.5609F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(41, 43).mirror().addBox(-2.5F, -0.2008F, -0.4183F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 43).addBox(1.7F, -0.2008F, -0.4183F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.8834F, -3.7179F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(47, 17).mirror().addBox(-0.1F, -0.6931F, -2.1292F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 4.3591F, -3.4021F, 1.3591F, -0.2715F, -1.0756F));

		PartDefinition cube_r84 = Body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(27, 20).mirror().addBox(-5.0F, 0.0F, -0.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5248F, -1.2306F, -0.2559F, 0.8901F, 0.3804F));

		PartDefinition cube_r85 = Body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(29, 32).mirror().addBox(-2.7F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5248F, -1.2306F, 0.0065F, 0.4799F, 0.7126F));

		PartDefinition cube_r86 = Body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(49, 41).mirror().addBox(-1.1F, -0.6936F, -0.5501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 41).addBox(0.1F, -0.6936F, -0.5501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4644F, -2.0821F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1F, 1.2841F, -1.5609F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(47, 17).addBox(-0.9F, -0.6931F, -2.1292F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 4.3591F, -3.4021F, 1.3591F, 0.2715F, 1.0756F));

		PartDefinition cube_r89 = Body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(27, 20).addBox(0.0F, 0.0F, -0.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 5.5248F, -1.2306F, -0.2559F, -0.8901F, -0.3804F));

		PartDefinition cube_r90 = Body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(29, 32).addBox(-0.3F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 5.5248F, -1.2306F, 0.0065F, -0.4799F, -0.7126F));

		PartDefinition cube_r91 = Body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6174F, 0.7016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3167F, -4.8535F, 0.1396F, 0.0F, 0.0F));

		PartDefinition RightArm3 = Body2.addOrReplaceChild("RightArm3", CubeListBuilder.create().texOffs(7, 49).addBox(0.5F, 0.0F, 0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 5.0972F, -2.8735F, 1.0385F, 0.5233F, 0.0804F));

		PartDefinition RightArm4 = RightArm3.addOrReplaceChild("RightArm4", CubeListBuilder.create().texOffs(30, 49).addBox(0.0F, -0.3F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(12, 49).addBox(0.0F, -0.3F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7F, 0.8F, -1.2725F, 0.3286F, 0.219F));

		PartDefinition RightArmHand2 = RightArm4.addOrReplaceChild("RightArmHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 4.39F, 0.5F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r92 = RightArmHand2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.48F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.49F, 0.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition LeftArm3 = Body2.addOrReplaceChild("LeftArm3", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.5F, 0.0F, 0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.0972F, -2.8735F, 0.6627F, -0.3598F, -0.0004F));

		PartDefinition LeftArm4 = LeftArm3.addOrReplaceChild("LeftArm4", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-1.0F, -0.3F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(5, 69).mirror().addBox(-1.0F, -0.3F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.7F, 0.8F, -1.1345F, 0.0F, 0.0F));

		PartDefinition LeftArmHand2 = LeftArm4.addOrReplaceChild("LeftArmHand2", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(0.0F, -0.01F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.39F, 0.5F, 0.0F, 0.0F, -0.9599F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3972F, -3.8735F, 0.0864F, 0.045F, -0.0401F));

		PartDefinition cube_r93 = Neck.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(61, 8).addBox(0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3971F, -3.0691F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Neck.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(59, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.736F, -1.4937F, 0.567F, 0.3398F, -0.6213F));

		PartDefinition cube_r95 = Neck.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(59, 35).mirror().addBox(-1.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.736F, -1.4937F, 0.4043F, 0.5256F, -1.0037F));

		PartDefinition cube_r96 = Neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(59, 35).addBox(0.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.736F, -1.4937F, 0.4043F, -0.5256F, 1.0037F));

		PartDefinition cube_r97 = Neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.736F, -1.4937F, 0.567F, -0.3398F, 0.6213F));

		PartDefinition cube_r98 = Neck.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(8, 44).addBox(-0.5F, -0.1241F, -2.899F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0805F, -0.207F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4971F, -2.8691F, -0.0269F, 0.0656F, 0.0598F));

		PartDefinition cube_r99 = Neck2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(14, 44).addBox(0.0F, 0.234F, 1.9985F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 45).addBox(0.0F, 0.334F, -0.0015F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 14).addBox(-0.5F, 0.934F, -0.0015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3019F, -3.0128F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r100 = Neck2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(58, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-0.6F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3184F, -0.5693F, -0.0286F, -0.02F, -0.6106F));

		PartDefinition cube_r101 = Neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 60).addBox(-0.4F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3184F, -0.5693F, -0.0286F, 0.02F, 0.6106F));

		PartDefinition cube_r102 = Neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(60, 29).addBox(0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 24).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -1.2019F, -4.9128F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(35, 32).addBox(-2.0F, -0.8686F, -2.7607F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 20).addBox(1.02F, -0.1686F, -1.5607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 32).addBox(0.56F, -0.2686F, -3.8607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 26).addBox(0.74F, -0.2686F, -3.8607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.17F))
				.texOffs(7, 6).addBox(0.52F, -0.4686F, -4.1607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(57, 51).addBox(1.02F, 0.8314F, -2.5607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(58, 26).mirror().addBox(-1.74F, -0.2686F, -3.8607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.17F)).mirror(false)
				.texOffs(58, 32).mirror().addBox(-1.56F, -0.2686F, -3.8607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 6).mirror().addBox(-1.52F, -0.4686F, -4.1607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(7, 20).mirror().addBox(-2.02F, -0.1686F, -1.5607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 51).mirror().addBox(-2.02F, 0.8314F, -2.5607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(38, 20).addBox(-1.0F, 1.2314F, -6.7607F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.3019F, -4.7128F, -0.0028F, -0.0577F, 0.0759F));

		PartDefinition cube_r103 = Head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(15, 19).addBox(-1.0F, -0.0698F, -1.8937F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.489F, -7.8725F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(48, 3).mirror().addBox(0.0F, -0.6F, -2.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 3).addBox(1.4F, -0.6F, -2.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.5254F, -7.7997F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(27, 12).addBox(-1.5F, -1.9F, -5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9314F, -2.7607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(39, 6).addBox(-1.0F, -1.0F, -3.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.7314F, -6.7607F, -0.2059F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 45).mirror().addBox(-2.12F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(57, 48).mirror().addBox(-2.12F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8314F, -2.5607F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-0.8F, -0.7F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.4422F, -2.9887F, -0.015F, -0.1783F, -0.3309F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(7, 14).mirror().addBox(0.08F, -1.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.5314F, -2.9607F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(6, 58).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.02F, -0.0944F, -4.7672F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(11, 58).mirror().addBox(-0.5F, -0.0531F, -0.2036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.02F, -0.3643F, -5.92F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.02F, 0.4357F, -6.02F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.02F, 0.5495F, -5.3377F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(50, 10).addBox(-0.2F, -0.7F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, -0.4422F, -2.9887F, -0.015F, 0.1783F, 0.3309F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(40, 39).addBox(-1.5F, 0.0335F, -0.0517F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0245F, -3.9077F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 35).addBox(-1.5F, -0.0612F, -1.0258F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6245F, -6.8077F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 45).addBox(-1.0F, -0.6F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4314F, -7.9607F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(57, 45).addBox(1.12F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(57, 48).addBox(1.12F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.8314F, -2.5607F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(7, 14).addBox(-1.08F, -1.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 1.5314F, -2.9607F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(6, 58).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.02F, -0.0944F, -4.7672F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(52, 20).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.02F, 0.5495F, -5.3377F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(11, 58).addBox(-0.5F, -0.0531F, -0.2036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.02F, -0.3643F, -5.92F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(56, 42).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.02F, 0.4357F, -6.02F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(41, 57).addBox(1.0F, -0.1F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(0, 20).addBox(1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 20).mirror().addBox(-2.0F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(41, 57).mirror().addBox(-2.0F, -0.1F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1314F, 0.2393F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r124 = Jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(0.0F, -0.5F, -3.6F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 0).addBox(1.38F, -0.5F, -3.6F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.69F, -0.6587F, -6.3449F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r125 = Jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(47, 45).mirror().addBox(0.0F, -0.3449F, -0.0396F, 0.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7189F, -1.8357F, -0.0549F, -0.305F, 0.0165F));

		PartDefinition cube_r126 = Jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(58, 5).mirror().addBox(-2.0F, -1.0217F, -0.0303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(58, 5).addBox(1.0F, -1.0217F, -0.0303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.1F, -0.9F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-2.0F, -1.2F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(52, 0).addBox(1.0F, -1.2F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.5F, -0.0076F, -0.0222F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(0, 41).addBox(0.5F, -0.0076F, -0.0222F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.9F, -6.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(19, 40).mirror().addBox(-1.5F, -1.0116F, -3.9173F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(19, 40).addBox(0.5F, -1.0116F, -3.9173F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2F, -3.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(47, 45).addBox(0.0F, -0.3449F, -0.0396F, 0.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7189F, -1.8357F, -0.0549F, 0.305F, -0.0165F));

		PartDefinition cube_r131 = Jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(42, 26).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.8714F, -8.2134F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(38, 26).addBox(-1.0F, -0.6F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.8282F, -9.6089F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(31, 39).addBox(-1.0F, -0.9792F, -3.1938F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0874F, -6.7626F, -0.1571F, 0.0F, 0.0F));

		PartDefinition RLeg = Base.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 0.6962F, 0.6745F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r134 = RLeg.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(29, 34).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4314F, 0.3371F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r135 = RLeg.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(57, 12).addBox(0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2314F, -0.2629F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r136 = RLeg.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 48).addBox(0.5F, 0.0F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3314F, 0.6371F, -0.0349F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.2109F, -0.581F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(15, 0).addBox(-0.5F, 0.2109F, 0.419F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 6.9314F, 0.2871F, 0.829F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, -0.1468F, -2.8625F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7631F, 0.7156F, -0.1309F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(39, 12).addBox(-1.5F, -0.7F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5532F, -2.8625F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RLeg3 = Base.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 0.6962F, 0.6745F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r137 = RLeg3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4314F, 0.3371F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r138 = RLeg3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(32, 73).mirror().addBox(-1.5F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.2314F, -0.2629F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r139 = RLeg3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(27, 69).mirror().addBox(-1.5F, 0.0F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3314F, 0.6371F, -0.0349F, 0.0F, 0.0F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create().texOffs(37, 67).mirror().addBox(-0.5F, 0.2109F, -0.581F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(42, 67).mirror().addBox(-0.5F, 0.2109F, 0.419F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.9314F, 0.2871F, 0.48F, 0.0F, 0.0F));

		PartDefinition RFoot3 = RLeg4.addOrReplaceChild("RFoot3", CubeListBuilder.create().texOffs(47, 70).mirror().addBox(-1.5F, -0.1468F, -2.8625F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.7631F, 0.7156F, -0.1309F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-1.5F, -0.7F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offset(0.0F, 0.5532F, -2.8625F));

		PartDefinition Tail = Base.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(10, 37).addBox(-0.5F, -0.39F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5038F, 3.8745F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r140 = Tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -1.2F, 3.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 28).addBox(0.0F, -1.0F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 35).addBox(0.0F, -0.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.39F, 0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Tail.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -2.1633F, 0.8944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(0.0F, -2.0633F, -1.1056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -1.7633F, -3.1056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5954F, 9.0914F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Tail.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(52, 58).addBox(0.0F, 0.6639F, 0.9418F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 58).addBox(0.0F, -0.2361F, -0.7903F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 0).addBox(0.0F, -1.2361F, -2.5223F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5954F, 9.0914F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(57, 36).addBox(0.0F, -1.247F, -0.6612F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6603F, 5.5532F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(38, 57).addBox(0.0F, -0.7788F, -0.2973F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4393F, 2.8724F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(25, 59).addBox(0.0F, -0.5F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7961F, 0.1413F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(11, 29).addBox(0.0F, 0.01F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 5.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(60, 37).addBox(0.0F, -0.4393F, 7.3332F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 11.0F, -0.0452F, 0.2615F, -0.0117F));

		PartDefinition cube_r147 = Tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2072F, 0.0627F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Tail2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(47, 31).addBox(0.0F, -1.2662F, -3.4266F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 41).addBox(0.0F, -0.1916F, -1.7398F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(0.0F, 0.883F, -0.053F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 54).addBox(0.0F, 1.9576F, 1.6338F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0248F, 5.2864F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Tail2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, -0.4968F, -3.9703F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 32).addBox(0.0F, -0.4968F, -1.9703F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 14).addBox(0.0F, -0.5968F, 0.0297F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0248F, 5.2864F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.2882F, -0.4345F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1728F, 9.7627F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition cube_r150 = Tail3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 14).addBox(0.0F, 0.8362F, 1.2312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 61).addBox(0.0F, -0.4494F, -0.3009F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7969F, 1.1993F, 0.7505F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5905F, -0.0939F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2818F, 11.4655F, -0.0457F, 0.3051F, -0.0138F));

		return LayerDefinition.create(meshdefinition, 75, 75);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}