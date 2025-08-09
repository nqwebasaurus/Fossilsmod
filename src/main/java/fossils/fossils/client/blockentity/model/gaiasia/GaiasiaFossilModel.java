package fossils.fossils.client.blockentity.model.gaiasia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GaiasiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart upperjaw;
	private final ModelPart leftHead;
	private final ModelPart rightHead;
	private final ModelPart lowerjaw;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public GaiasiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.head = this.body.getChild("head");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftHead = this.upperjaw.getChild("leftHead");
		this.rightHead = this.upperjaw.getChild("rightHead");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.armL = this.body.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.body.getChild("armL3");
		this.armL4 = this.armL3.getChild("armL4");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.legL = this.body3.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body3.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -7.4F, -6.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 28).addBox(-1.1F, -0.2745F, -7.4076F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.6F, -1.3303F, 0.2378F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 54).addBox(-0.6F, -1.5589F, -0.0373F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.3303F, -1.9622F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 3).addBox(-0.6F, -1.5834F, -0.0188F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0303F, -3.9622F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 55).addBox(-0.6F, -1.5326F, -0.0833F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.7303F, -5.8622F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 55).addBox(0.0F, -1.4749F, -0.0179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.85F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 10).addBox(0.0F, -1.205F, -0.0156F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -9.85F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 45).addBox(0.0F, -1.2721F, -0.2005F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -13.65F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 21).addBox(0.0F, -1.0351F, -0.0099F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -11.85F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(22, 38).mirror().addBox(1.1F, 3.3991F, 0.1477F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 0).mirror().addBox(0.1F, 0.3991F, 0.1477F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1187F, -8.4805F, -0.4497F, -0.0175F, 0.5233F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 38).addBox(-3.1F, 3.3991F, 0.1477F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(-1.1F, 0.3991F, 0.1477F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1187F, -8.4805F, -0.4497F, 0.0175F, -0.5233F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -12.85F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-1.2906F, 1.4086F, -0.2755F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6303F, -1.5622F, 0.3887F, -0.0439F, 0.3168F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(41, 55).mirror().addBox(0.0048F, -0.0873F, -0.2755F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6303F, -1.5622F, 0.2636F, -0.2923F, 1.0282F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-1.2552F, 1.4435F, -0.5644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4303F, -3.2622F, 0.3721F, -0.0385F, 0.3175F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(55, 15).mirror().addBox(0.0545F, -0.0854F, -0.5644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4303F, -3.2622F, 0.2542F, -0.2774F, 1.0308F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(0.0326F, -0.097F, -0.5542F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.2303F, -5.2622F, 0.3218F, -0.3815F, 1.0089F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-1.2636F, 1.4202F, -0.5542F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.2303F, -5.2622F, 0.4885F, -0.0763F, 0.3108F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 31).mirror().addBox(0.0025F, -0.1112F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1697F, -7.2622F, 0.3421F, -0.411F, 1.0011F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-1.2762F, 1.3894F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1697F, -7.2622F, 0.5219F, -0.0869F, 0.3081F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(49, 16).mirror().addBox(-0.04F, 0.0503F, -0.2794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.1697F, -9.3622F, 0.0404F, 0.0706F, 0.3121F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(0.0F, -0.1034F, -0.4216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2697F, -9.3622F, 0.0774F, 0.0248F, 1.0534F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, -0.1034F, -0.4216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2697F, -11.3622F, 0.0269F, 0.0492F, 0.8274F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(21, 16).mirror().addBox(0.0F, -0.1034F, -0.4216F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2697F, -13.3622F, 0.1489F, 0.0531F, 0.6527F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(48, 4).addBox(0.0F, -0.1034F, -0.4216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2697F, -9.3622F, 0.0774F, -0.0248F, -1.0534F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(49, 16).addBox(0.04F, 0.0503F, -0.2794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.1697F, -9.3622F, 0.0404F, -0.0706F, -0.3121F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(41, 55).addBox(-0.0048F, -0.0873F, -0.2755F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.6303F, -1.5622F, 0.2636F, 0.2923F, -1.0282F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 10).addBox(1.2906F, 1.4086F, -0.2755F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.6303F, -1.5622F, 0.3887F, 0.0439F, -0.3168F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 15).addBox(-0.0545F, -0.0854F, -0.5644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4303F, -3.2622F, 0.2542F, 0.2774F, -1.0308F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(15, 55).addBox(1.2552F, 1.4435F, -0.5644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4303F, -3.2622F, 0.3721F, 0.0385F, -0.3175F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 50).addBox(1.2636F, 1.4202F, -0.5542F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2303F, -5.2622F, 0.4885F, 0.0763F, -0.3108F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 55).addBox(-0.0326F, -0.097F, -0.5542F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2303F, -5.2622F, 0.3218F, 0.3815F, -1.0089F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(50, 42).addBox(1.2762F, 1.3894F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1697F, -7.2622F, 0.5219F, 0.0869F, -0.3081F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(55, 31).addBox(-0.0025F, -0.1112F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1697F, -7.2622F, 0.3421F, 0.411F, -1.0011F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -0.1034F, -0.4216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2697F, -11.3622F, 0.0269F, -0.0492F, -0.8274F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(21, 16).addBox(0.0F, -0.1034F, -0.4216F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2697F, -13.3622F, 0.1489F, -0.0531F, -0.6527F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -15.25F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -16.5F, -0.0552F, 0.3463F, 0.1828F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, -1.7F, -11.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F))
				.texOffs(30, 28).addBox(0.7F, -1.7F, -11.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 22).addBox(1.5F, -1.9F, -10.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 30).addBox(2.0F, -1.1F, -9.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 47).addBox(-0.1F, -1.8F, -11.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 47).mirror().addBox(-0.9F, -1.8F, -11.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 28).mirror().addBox(-1.7F, -1.7F, -11.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 22).mirror().addBox(-2.5F, -1.9F, -10.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 30).mirror().addBox(-3.0F, -1.1F, -9.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.0F, 2.4F, 3.0F));

		PartDefinition cube_r37 = upperjaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(28, 18).addBox(-1.0F, 0.0232F, 0.0164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.4463F, -3.2523F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r38 = upperjaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.1569F, -0.1225F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.5F, -7.0F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r39 = upperjaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(33, 36).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.0F, -12.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r40 = upperjaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(7, 16).mirror().addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6991F, -0.6779F, -7.6996F, 0.0347F, -0.0871F, 0.0046F));

		PartDefinition cube_r41 = upperjaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(0.1295F, -0.7366F, -0.0974F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2867F, -0.6F, -8.8241F, -0.0578F, -0.4357F, 0.0244F));

		PartDefinition cube_r42 = upperjaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(39, 47).mirror().addBox(0.1376F, -0.8361F, -0.1353F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7867F, -0.6F, -10.7241F, -0.0542F, -0.2614F, 0.014F));

		PartDefinition cube_r43 = upperjaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(38, 24).mirror().addBox(0.0623F, -0.8989F, 0.027F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -0.6F, -11.9241F, -0.0959F, -0.9927F, 0.0804F));

		PartDefinition cube_r44 = upperjaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(7, 16).addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6991F, -0.6779F, -7.6996F, 0.0347F, 0.0871F, -0.0046F));

		PartDefinition cube_r45 = upperjaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(39, 0).addBox(-0.1295F, -0.7366F, -0.0974F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2867F, -0.6F, -8.8241F, -0.0578F, 0.4357F, -0.0244F));

		PartDefinition cube_r46 = upperjaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(39, 47).addBox(-0.1376F, -0.8361F, -0.1353F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7867F, -0.6F, -10.7241F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition cube_r47 = upperjaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(38, 24).addBox(-0.0623F, -0.8989F, 0.027F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9867F, -0.6F, -11.9241F, -0.0959F, 0.9927F, -0.0804F));

		PartDefinition cube_r48 = upperjaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(30, 8).addBox(-1.5867F, -0.7F, -3.7759F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(41, 10).addBox(-1.5867F, -1.0F, -3.8759F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5867F, -0.6F, -8.1241F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftHead = upperjaw.addOrReplaceChild("leftHead", CubeListBuilder.create(), PartPose.offset(1.9139F, -1.6039F, -10.8179F));

		PartDefinition cube_r49 = leftHead.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(8, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1547F, 0.2703F, 0.1373F));

		PartDefinition cube_r50 = leftHead.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 44).addBox(-1.9623F, -1.1989F, 0.027F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.9272F, 1.0039F, -1.1062F, 0.2223F, 0.9793F, 0.2998F));

		PartDefinition cube_r51 = leftHead.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(41, 43).addBox(-2.0376F, -1.1361F, -0.1353F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.8728F, 1.0039F, 0.0938F, -0.0021F, 0.2669F, 0.1848F));

		PartDefinition cube_r52 = leftHead.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(41, 16).addBox(-2.0295F, -1.0366F, -0.8974F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.3728F, 1.0039F, 1.9938F, 0.0889F, 0.4308F, 0.322F));

		PartDefinition cube_r53 = leftHead.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(9, 37).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7336F, -0.0282F, 3.0524F, 0.1123F, 0.2394F, 0.3148F));

		PartDefinition cube_r54 = leftHead.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 9).addBox(-0.0207F, -0.0709F, -2.6671F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9139F, -0.863F, 3.6773F, 0.1387F, 0.1848F, 0.2472F));

		PartDefinition cube_r55 = leftHead.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(14, 30).addBox(0.1F, -1.5F, -3.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9139F, 0.6039F, 9.8179F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r56 = leftHead.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(26, 41).addBox(-0.3816F, -0.1161F, -0.9447F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.8553F, -1.6246F, 7.6951F, 0.1627F, 0.2856F, 0.3036F));

		PartDefinition cube_r57 = leftHead.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(13, 38).addBox(0.0F, -0.0201F, -2.1994F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.9139F, -1.4443F, 5.8258F, 0.194F, -0.0516F, 0.2568F));

		PartDefinition cube_r58 = leftHead.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(9, 45).addBox(-0.1875F, -1.9165F, -1.865F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2861F, 1.4039F, 5.5179F, -0.335F, -0.0979F, -0.9183F));

		PartDefinition cube_r59 = leftHead.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7945F, -3.2453F, -0.2146F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5861F, 1.2039F, 5.7179F, -0.0872F, 0.0603F, -0.8015F));

		PartDefinition rightHead = upperjaw.addOrReplaceChild("rightHead", CubeListBuilder.create(), PartPose.offset(-1.9139F, -1.6039F, -10.8179F));

		PartDefinition cube_r60 = rightHead.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(8, 9).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1547F, -0.2703F, -0.1373F));

		PartDefinition cube_r61 = rightHead.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.0377F, -1.1989F, 0.027F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.9272F, 1.0039F, -1.1062F, 0.2223F, -0.9793F, -0.2998F));

		PartDefinition cube_r62 = rightHead.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(41, 43).mirror().addBox(0.0376F, -1.1361F, -0.1353F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8728F, 1.0039F, 0.0938F, -0.0021F, -0.2669F, -0.1848F));

		PartDefinition cube_r63 = rightHead.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(0.0295F, -1.0366F, -0.8974F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.3728F, 1.0039F, 1.9938F, 0.0889F, -0.4308F, -0.322F));

		PartDefinition cube_r64 = rightHead.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(9, 37).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7336F, -0.0282F, 3.0524F, 0.1123F, -0.2394F, -0.3148F));

		PartDefinition cube_r65 = rightHead.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.9793F, -0.0709F, -2.6671F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9139F, -0.863F, 3.6773F, 0.1387F, -0.1848F, -0.2472F));

		PartDefinition cube_r66 = rightHead.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(14, 30).mirror().addBox(-2.1F, -1.5F, -3.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.9139F, 0.6039F, 9.8179F, 0.0F, -0.4538F, 0.0F));

		PartDefinition cube_r67 = rightHead.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(26, 41).mirror().addBox(-1.6184F, -0.1161F, -0.9447F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.8553F, -1.6246F, 7.6951F, 0.1627F, -0.2856F, -0.3036F));

		PartDefinition cube_r68 = rightHead.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(13, 38).mirror().addBox(-2.0F, -0.0201F, -2.1994F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.9139F, -1.4443F, 5.8258F, 0.194F, 0.0516F, -0.2568F));

		PartDefinition cube_r69 = rightHead.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(9, 45).mirror().addBox(-0.8125F, -1.9165F, -1.865F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2861F, 1.4039F, 5.5179F, -0.335F, 0.0979F, 0.9183F));

		PartDefinition cube_r70 = rightHead.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.2055F, -3.2453F, -0.2146F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5861F, 1.2039F, 5.7179F, -0.0872F, -0.0603F, 0.8015F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(29, 38).addBox(-1.0F, -0.0863F, -11.0138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(0.0F, -1.1863F, -11.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 48).addBox(1.0F, -0.8863F, -10.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 31).addBox(1.7F, -0.5863F, -9.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 0).mirror().addBox(-1.0F, -1.1863F, -11.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 48).mirror().addBox(-2.0F, -0.8863F, -10.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 31).mirror().addBox(-2.7F, -0.5863F, -9.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5F, 2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r71 = lowerjaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(47, 24).mirror().addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1712F, 0.5717F, -9.7853F, -0.2199F, -0.907F, 0.1379F));

		PartDefinition cube_r72 = lowerjaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(23, 46).mirror().addBox(-0.1238F, -0.5541F, 0.0322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.272F, 0.6755F, -9.9253F, -0.0503F, -0.2096F, -0.0074F));

		PartDefinition cube_r73 = lowerjaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-0.0069F, -0.1955F, -5.009F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3084F, 0.6811F, -4.0218F, -0.0524F, -0.3491F, 0.0F));

		PartDefinition cube_r74 = lowerjaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(28, 13).mirror().addBox(-0.4935F, -0.5833F, -2.0404F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8638F, 0.4551F, -1.7185F, -0.0341F, -0.0089F, -0.0073F));

		PartDefinition cube_r75 = lowerjaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(16, 45).mirror().addBox(0.2931F, -1.1724F, -4.9741F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 3).mirror().addBox(-0.0069F, -0.8724F, -4.7741F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3084F, 0.6811F, -4.0218F, 0.0873F, -0.3491F, 0.0F));

		PartDefinition cube_r76 = lowerjaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(30, 28).mirror().addBox(-0.4871F, -0.3155F, -2.4854F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8638F, 0.4551F, -1.7185F, 0.1571F, -0.0436F, 0.0F));

		PartDefinition cube_r77 = lowerjaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(47, 24).addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1712F, 0.5717F, -9.7853F, -0.2199F, 0.907F, -0.1379F));

		PartDefinition cube_r78 = lowerjaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(23, 46).addBox(-0.8762F, -0.5541F, 0.0322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.272F, 0.6755F, -9.9253F, -0.0503F, 0.2096F, 0.0074F));

		PartDefinition cube_r79 = lowerjaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(39, 24).addBox(-0.9931F, -0.1955F, -5.009F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3084F, 0.6811F, -4.0218F, -0.0524F, 0.3491F, 0.0F));

		PartDefinition cube_r80 = lowerjaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5065F, -0.5833F, -2.0404F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8638F, 0.4551F, -1.7185F, -0.0341F, 0.0089F, 0.0073F));

		PartDefinition cube_r81 = lowerjaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(16, 45).addBox(-0.2931F, -1.1724F, -4.9741F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 3).addBox(-0.9931F, -0.8724F, -4.7741F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3084F, 0.6811F, -4.0218F, 0.0873F, 0.3491F, 0.0F));

		PartDefinition cube_r82 = lowerjaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(30, 28).addBox(-0.5129F, -0.3155F, -2.4854F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8638F, 0.4551F, -1.7185F, 0.1571F, 0.0436F, 0.0F));

		PartDefinition armL = body.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 3.4F, -9.1F, -0.7366F, 0.9353F, -0.1741F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(44, 55).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition armL3 = body.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, 3.4F, -9.1F, 0.0F, -0.6545F, 0.0F));

		PartDefinition armL4 = armL3.addOrReplaceChild("armL4", CubeListBuilder.create().texOffs(55, 43).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 1.25F, 0.1329F, 0.2174F, 0.0117F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.35F, -0.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(32, 53).addBox(0.0F, -1.247F, -0.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7311F, 6.8663F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(35, 53).addBox(0.0F, -1.4343F, -0.0117F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7311F, 4.8663F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(53, 40).addBox(0.0F, -1.5215F, -0.0136F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7311F, 2.8663F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(53, 53).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7311F, 0.8663F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(17, 5).mirror().addBox(0.0274F, 0.036F, -0.3317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9303F, 7.2878F, 0.1641F, -0.1268F, 1.1362F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(6, 54).mirror().addBox(-0.6735F, 0.783F, -0.3317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9303F, 7.2878F, 0.2064F, 0.0163F, 0.4066F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(54, 11).mirror().addBox(-1.3378F, 1.5233F, -0.5306F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0303F, 5.4878F, 0.2395F, 0.0053F, 0.1975F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(34, 12).mirror().addBox(0.0475F, 0.0292F, -0.5306F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0303F, 5.4878F, 0.1817F, -0.157F, 0.9243F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(0.276F, 1.0063F, -0.3955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -1.1303F, 3.4878F, 0.2064F, 0.0163F, 0.3193F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(54, 19).mirror().addBox(0.8881F, -1.4422F, -0.3955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -1.1303F, 3.4878F, 0.1641F, -0.1268F, 1.049F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(21, 55).mirror().addBox(0.0025F, -0.1112F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.0303F, 1.4878F, 0.1995F, -0.1872F, 1.0434F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-1.2762F, 1.3894F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.0303F, 1.4878F, 0.2727F, -0.0057F, 0.3197F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(54, 35).mirror().addBox(-1.2762F, 1.3894F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.0303F, -0.5122F, 0.3224F, -0.0221F, 0.319F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(0.0025F, -0.1112F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.0303F, -0.5122F, 0.2266F, -0.2324F, 1.0378F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(6, 54).addBox(0.6735F, 0.783F, -0.3317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9303F, 7.2878F, 0.2064F, -0.0163F, -0.4066F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(17, 5).addBox(-0.0274F, 0.036F, -0.3317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9303F, 7.2878F, 0.1641F, 0.1268F, -1.1362F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 11).addBox(1.3378F, 1.5233F, -0.5306F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0303F, 5.4878F, 0.2395F, -0.0053F, -0.1975F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(34, 12).addBox(-0.0475F, 0.0292F, -0.5306F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0303F, 5.4878F, 0.1817F, 0.157F, -0.9243F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(54, 19).addBox(-0.8881F, -1.4422F, -0.3955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -1.1303F, 3.4878F, 0.1641F, 0.1268F, -1.049F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(54, 23).addBox(-0.276F, 1.0063F, -0.3955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -1.1303F, 3.4878F, 0.2064F, -0.0163F, -0.3193F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(21, 55).addBox(-0.0025F, -0.1112F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0303F, 1.4878F, 0.1995F, 0.1872F, -1.0434F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(25, 54).addBox(1.2762F, 1.3894F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0303F, 1.4878F, 0.2727F, 0.0057F, -0.3197F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(55, 27).addBox(-0.0025F, -0.1112F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0303F, -0.5122F, 0.2266F, 0.2324F, -1.0378F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(54, 35).addBox(1.2762F, 1.3894F, -0.5212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.0303F, -0.5122F, 0.3224F, 0.0221F, -0.319F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(54, 48).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7311F, -1.1337F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, 9.0F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.6F, -1.6148F, -0.7554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1F, 7.3F, -0.0475F, 0.0221F, 0.4358F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.4599F, -0.5967F, -0.0027F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6752F, 3.4293F, 6.4243F, -0.0427F, 0.2445F, -0.3819F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5401F, -0.5967F, -0.0027F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6752F, 3.4293F, 6.4243F, -0.0427F, -0.2445F, 0.3819F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6F, -1.6148F, -0.7554F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.1F, 7.3F, -0.0475F, -0.0221F, -0.4358F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(52, 45).addBox(0.0F, -1.0933F, -0.1195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1311F, 5.9663F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -1.2104F, -0.022F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, 7.8663F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-0.6735F, 0.783F, -0.3317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4697F, 4.2878F, 0.1069F, 0.049F, 0.159F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(0.0274F, 0.036F, -0.3317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4697F, 4.2878F, 0.112F, -0.0359F, 0.8961F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(0.9403F, 0.266F, -0.1967F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.3697F, 2.2878F, 0.1732F, 0.0272F, 0.3186F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(15, 16).mirror().addBox(0.868F, -1.4355F, -0.1967F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.3697F, 2.2878F, 0.1466F, -0.0965F, 1.0509F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(39, 51).mirror().addBox(0.9403F, 0.266F, -0.1967F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.2697F, 0.2878F, 0.2064F, 0.0163F, 0.3193F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(0.868F, -1.4355F, -0.1967F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.2697F, 0.2878F, 0.1641F, -0.1268F, 1.049F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(51, 20).addBox(0.6735F, 0.783F, -0.3317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4697F, 4.2878F, 0.1069F, -0.049F, -0.159F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 9).addBox(-0.0274F, 0.036F, -0.3317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4697F, 4.2878F, 0.112F, 0.0359F, -0.8961F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(51, 37).addBox(-0.9403F, 0.266F, -0.1967F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.3697F, 2.2878F, 0.1732F, -0.0272F, -0.3186F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(15, 16).addBox(-0.868F, -1.4355F, -0.1967F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.3697F, 2.2878F, 0.1466F, 0.0965F, -1.0509F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(17, 0).addBox(-0.868F, -1.4355F, -0.1967F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.2697F, 0.2878F, 0.1641F, 0.1268F, -1.049F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(39, 51).addBox(-0.9403F, 0.266F, -0.1967F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.2697F, 0.2878F, 0.2064F, -0.0163F, -0.3193F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(53, 0).addBox(0.0F, -1.185F, -0.0171F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2311F, 3.8663F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 7).addBox(0.0F, -1.3766F, 0.0809F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2311F, 1.7663F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(16, 45).addBox(0.0F, -1.0597F, -0.0122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.1337F, -0.1833F, 0.0F, 0.0F));

		PartDefinition legL = body3.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(15, 21).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 3.2F, 7.75F, -0.1616F, 0.3086F, 0.1465F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(43, 33).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.25F, 0.0F, 3.0F, 0.2618F, -0.2618F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -0.25F, 2.25F, 0.0F, -0.2182F, 0.0F));

		PartDefinition legL4 = body3.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(17, 5).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, 3.2F, 7.75F, -0.072F, -1.0028F, 0.0406F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(32, 43).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.25F, 0.0F, 3.0F, 0.2618F, 0.2618F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(8, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -0.25F, 2.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.45F, 9.0F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r131 = tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0198F, -1.9988F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(38, 55).addBox(0.0F, -0.179F, -0.0354F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7522F, 0.8872F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(20, 50).addBox(0.0F, -0.2576F, -0.0542F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4648F, 2.894F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(23, 50).addBox(0.0F, 0.0769F, 0.0294F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3772F, 4.8052F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(11, 50).addBox(0.0F, 0.2637F, -0.0741F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2899F, 6.9076F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(14, 50).addBox(0.0F, -0.2307F, 0.0699F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8023F, 8.8232F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(52, 16).addBox(0.0F, -1.8337F, -0.1539F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2252F, 2.994F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, -1.5231F, -0.0201F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4113F, 0.8675F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(52, 28).addBox(0.0F, -1.9548F, -0.0861F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0627F, 8.9232F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(29, 52).addBox(0.0F, -1.9637F, -0.0741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0503F, 6.9076F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(52, 32).addBox(0.0F, -1.9508F, -0.1689F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1376F, 5.0052F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3698F, 9.7012F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r142 = tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(30, 47).addBox(0.0F, -0.02F, 0.0686F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3452F, 1.1201F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(5, 48).addBox(0.0F, 0.1301F, 0.0005F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3452F, 3.2201F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(33, 48).addBox(0.0F, -0.0534F, -0.1835F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2452F, 5.4201F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(36, 48).addBox(0.0F, -0.4977F, -0.1184F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4452F, 7.4201F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(3, 52).addBox(0.0F, 0.0405F, -0.1659F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.499F, 9.4653F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 38).addBox(0.0F, -2.5254F, -0.0492F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3066F, 9.2785F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(17, 50).addBox(0.0F, -2.8295F, -0.0082F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4452F, 7.2201F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(49, 31).addBox(0.0F, -2.8768F, -0.0386F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4452F, 5.2201F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(49, 46).addBox(0.0F, -2.5067F, -0.1675F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4452F, 3.3201F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(8, 50).addBox(0.0F, -2.3766F, 0.0164F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4452F, 1.1201F, -0.2007F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, 11.3F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r152 = tail3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(42, 51).addBox(0.0F, -0.2557F, -0.0112F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4048F, 0.1002F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(45, 51).addBox(0.0F, -0.7171F, -0.1522F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5499F, 2.2566F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(21, 21).addBox(0.0F, 0.0131F, 0.0032F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4952F, 4.1201F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -0.1719F, -0.1981F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2952F, 6.3201F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(23, 5).addBox(0.0F, -0.3064F, -0.0307F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3065F, 8.1828F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(14, 30).addBox(0.0F, -0.6351F, -0.1582F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3592F, 10.3525F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(41, 16).addBox(0.0F, -0.5208F, -0.0944F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3043F, 12.3089F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(38, 43).addBox(0.0F, -3.8372F, 19.4386F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 38).addBox(0.0F, -3.8372F, 17.4386F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3952F, -7.5799F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, -0.9079F, 0.0331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5065F, 8.0828F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -1.2981F, 0.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4674F, 6.0569F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(48, 51).addBox(0.0F, -1.4229F, 0.0148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3952F, 4.0201F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(51, 50).addBox(0.0F, -1.5702F, -0.0156F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3952F, 2.0201F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, -1.9538F, -0.1364F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4048F, 0.1002F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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