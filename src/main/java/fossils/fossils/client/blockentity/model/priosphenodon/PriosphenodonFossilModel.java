package fossils.fossils.client.blockentity.model.priosphenodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PriosphenodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PriosphenodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.4068F, 9.7698F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 53).addBox(0.0F, -1.1F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0109F, 0.957F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 72).addBox(0.0F, -1.15F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1106F, -0.9639F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 54).addBox(0.0F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, -2.9602F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2993F, -3.0262F, -0.0493F, 0.0693F, -0.3529F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2993F, -3.0262F, -0.0493F, -0.0693F, 0.3529F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.939F, 3.7067F, -0.9497F, 0.1615F, -0.0665F, 0.4309F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 44).addBox(0.2116F, -0.2417F, -1.2527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 2.0499F, 0.3059F, -2.5349F, -0.1421F, -0.2667F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 61).addBox(0.2116F, 0.2791F, -1.0725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 2.0499F, 0.3059F, -2.8491F, -0.1421F, -0.2667F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 4).addBox(-0.2318F, -1.03F, -2.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(40, 73).addBox(-0.2318F, -0.33F, -2.3797F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 2.0499F, 0.3059F, 0.0067F, -0.2261F, 0.4359F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 79).addBox(0.5328F, 0.6167F, -1.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(86, 3).addBox(0.5328F, 0.6167F, -2.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 2.0499F, 0.3059F, -0.0385F, -0.1885F, 1.0594F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 25).addBox(-0.2318F, -0.5341F, -1.8345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(59, 79).addBox(-0.2318F, -0.9591F, -1.8345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.1568F, 2.0499F, 0.3059F, 0.1376F, -0.2261F, 0.4359F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(84, 0).addBox(-0.0421F, -1.5025F, -0.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, -0.6253F, -0.2099F, 0.2586F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 82).addBox(-0.0421F, 1.4599F, -0.1579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, 1.6F, -0.2099F, 0.2586F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(82, 41).addBox(-0.0421F, 0.7093F, 0.0424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, 1.4691F, -0.2099F, 0.2586F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(81, 13).addBox(-0.0421F, 1.0958F, -1.5337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, 2.2545F, -0.2099F, 0.2586F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 82).addBox(-0.0421F, -1.095F, -1.7542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, -2.7633F, -0.2099F, 0.2586F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(45, 81).addBox(-0.0421F, -1.1698F, -0.7311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(86, 53).addBox(-0.0421F, -1.1698F, -0.0311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, -1.3234F, -0.2099F, 0.2586F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 63).addBox(0.2935F, -2.249F, 0.4141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, -1.2229F, -0.3714F, 0.75F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(62, 13).addBox(0.1895F, -1.7263F, -0.082F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, -1.7202F, -0.2068F, 0.8106F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(82, 47).addBox(-0.0421F, -0.2713F, -0.1882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, -0.2326F, -0.2099F, 0.2586F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(81, 54).addBox(-0.0421F, -0.5835F, -0.2413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, 0.0728F, -0.2099F, 0.2586F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(50, 81).addBox(-0.0421F, -0.8021F, -0.1386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, 0.8146F, -0.2099F, 0.2586F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(69, 52).addBox(0.2116F, -2.0127F, -0.2144F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1568F, 1.8499F, 0.8059F, 1.6451F, -0.1421F, -0.2667F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(66, 57).addBox(-0.5F, -0.9F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 66).addBox(-0.5F, -0.8F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F))
				.texOffs(7, 66).addBox(-0.5F, -0.1F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9043F, 1.1338F, -1.397F, -3.1109F, -0.1421F, -0.2667F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(74, 79).addBox(0.2116F, -0.3884F, 1.1061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1568F, 2.0499F, 0.3059F, 2.4742F, -0.1421F, -0.2667F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -1.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3473F, -0.3704F, -0.4124F, 2.6051F, -0.1421F, -0.2667F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(82, 67).addBox(-0.4686F, -0.0331F, 0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6361F, -3.9881F, -0.9422F, -1.0791F, -0.0915F, -0.2549F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(79, 17).addBox(-0.4686F, -1.2808F, 0.0478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.6361F, -3.9881F, -0.9422F, 0.099F, -0.0915F, -0.2549F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(78, 57).addBox(-0.4686F, -1.5012F, 0.3589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(77, 71).addBox(-0.4686F, -1.5012F, 0.5589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.6361F, -3.9881F, -0.9422F, -0.2064F, -0.0915F, -0.2549F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(27, 72).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(22, 72).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5002F, -3.3583F, -0.3014F, 0.0194F, -0.1007F, -0.2579F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.1005F, -1.7119F, 0.0298F, 0.4994F, -0.1007F, -0.2579F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(73, 57).addBox(-0.4686F, -0.5643F, -0.139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.6361F, -3.9881F, -0.9422F, -0.4682F, -0.0915F, -0.2549F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.939F, 3.7067F, -0.9497F, 0.1615F, 0.0665F, -0.4309F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(82, 44).mirror().addBox(-1.2116F, -0.2417F, -1.2527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 2.0499F, 0.3059F, -2.5349F, 0.1421F, 0.2667F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(7, 61).mirror().addBox(-1.2116F, 0.2791F, -1.0725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 2.0499F, 0.3059F, -2.8491F, 0.1421F, 0.2667F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-0.7682F, -1.03F, -2.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(40, 73).mirror().addBox(-0.7682F, -0.33F, -2.3797F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 2.0499F, 0.3059F, 0.0067F, 0.2261F, -0.4359F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 79).mirror().addBox(-1.5328F, 0.6167F, -1.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(86, 3).mirror().addBox(-1.5328F, 0.6167F, -2.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 2.0499F, 0.3059F, -0.0385F, 0.1885F, -1.0594F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(15, 25).mirror().addBox(-0.7682F, -0.5341F, -1.8345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(59, 79).mirror().addBox(-0.7682F, -0.9591F, -1.8345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 2.0499F, 0.3059F, 0.1376F, 0.2261F, -0.4359F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.9579F, -1.5025F, -0.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, -0.6253F, 0.2099F, -0.2586F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-0.9579F, 1.4599F, -0.1579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, 1.6F, 0.2099F, -0.2586F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(82, 41).mirror().addBox(-0.9579F, 0.7093F, 0.0424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, 1.4691F, 0.2099F, -0.2586F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 13).mirror().addBox(-0.9579F, 1.0958F, -1.5337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, 2.2545F, 0.2099F, -0.2586F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.9579F, -1.095F, -1.7542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, -2.7633F, 0.2099F, -0.2586F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.9579F, -1.1698F, -0.7311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(86, 53).mirror().addBox(-0.9579F, -1.1698F, -0.0311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, -1.3234F, 0.2099F, -0.2586F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(55, 63).mirror().addBox(-1.2935F, -2.249F, 0.4141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, -1.2229F, 0.3714F, -0.75F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(62, 13).mirror().addBox(-1.1895F, -1.7263F, -0.082F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, -1.7202F, 0.2068F, -0.8106F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(82, 47).mirror().addBox(-0.9579F, -0.2713F, -0.1882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, -0.2326F, 0.2099F, -0.2586F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(81, 54).mirror().addBox(-0.9579F, -0.5835F, -0.2413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, 0.0728F, 0.2099F, -0.2586F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.9579F, -0.8021F, -0.1386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, 0.8146F, 0.2099F, -0.2586F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-1.2116F, -2.0127F, -0.2144F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 1.8499F, 0.8059F, 1.6451F, 0.1421F, 0.2667F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(66, 57).mirror().addBox(-0.5F, -0.9F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(42, 66).mirror().addBox(-0.5F, -0.8F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(7, 66).mirror().addBox(-0.5F, -0.1F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9043F, 1.1338F, -1.397F, -3.1109F, 0.1421F, 0.2667F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-1.2116F, -0.3884F, 1.1061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.1568F, 2.0499F, 0.3059F, 2.4742F, 0.1421F, 0.2667F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5F, -1.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.3473F, -0.3704F, -0.4124F, 2.6051F, 0.1421F, 0.2667F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-0.5314F, -0.0331F, 0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6361F, -3.9881F, -0.9422F, -1.0791F, 0.0915F, 0.2549F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(79, 17).mirror().addBox(-0.5314F, -1.2808F, 0.0478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.6361F, -3.9881F, -0.9422F, 0.099F, 0.0915F, 0.2549F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(-0.5314F, -1.5012F, 0.3589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(77, 71).mirror().addBox(-0.5314F, -1.5012F, 0.5589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.6361F, -3.9881F, -0.9422F, -0.2064F, 0.0915F, 0.2549F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(22, 72).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5002F, -3.3583F, -0.3014F, 0.0194F, 0.1007F, 0.2579F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.1005F, -1.7119F, 0.0298F, 0.4994F, 0.1007F, 0.2579F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(73, 57).mirror().addBox(-0.5314F, -0.5643F, -0.139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.6361F, -3.9881F, -0.9422F, -0.4682F, 0.0915F, 0.2549F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3994F, 5.2126F, -0.2947F, -0.5392F, 0.1282F, -1.464F));

		PartDefinition upperleg8_r1 = upperleg2.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.1155F, 0.1723F, 0.7679F, 0.0F, 0.0F));

		PartDefinition upperleg8_r2 = upperleg2.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(76, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.8866F, -0.8218F, 0.4102F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(0, 87).addBox(0.5F, -0.9032F, -0.328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 0.7753F, -0.5097F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(77, 47).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.1357F, 2.1924F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(76, 5).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 4.1692F, 1.828F, 0.1833F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(74, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8727F, 0.0061F, 0.4887F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(52, 72).addBox(0.5F, -2.0686F, -1.3385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2737F, 8.1936F, 1.4303F, 0.9837F, -1.4251F, 0.303F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(22, 47).addBox(-0.2F, -2.5F, -1.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4465F, 2.5773F, 0.804F, -1.5272F, 1.5184F, -1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(54, 77).addBox(-0.575F, -0.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8465F, 0.0786F, -0.0092F, 1.5708F, 1.5446F, 1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(5, 86).addBox(-0.375F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.0465F, 0.4899F, -0.1802F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(76, 13).addBox(-0.45F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.0465F, 2.1365F, 0.1654F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition leg5_r2 = leg2.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(70, 85).addBox(-0.9821F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(65, 85).addBox(-0.9821F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0465F, 0.9402F, -0.6918F, 1.5708F, 1.2828F, 1.5708F));

		PartDefinition leg4_r3 = leg2.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(49, 66).addBox(-0.1F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0465F, 3.7792F, 0.6775F, -1.5708F, 1.4661F, -1.5708F));

		PartDefinition leg4_r4 = leg2.addOrReplaceChild("leg4_r4", CubeListBuilder.create().texOffs(86, 6).addBox(-0.1F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0465F, 3.2811F, 0.6339F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(85, 63).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0465F, 2.5837F, 0.5729F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(30, 29).addBox(-2.0487F, -0.975F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0021F, 8.2623F, 0.9321F, 0.3097F, 0.0201F, -0.0487F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0487F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0229F, -2.7873F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3994F, 5.2126F, -0.2947F, -0.7084F, -0.43F, 1.1345F));

		PartDefinition upperleg9_r1 = upperleg3.addOrReplaceChild("upperleg9_r1", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1155F, 0.1723F, 0.7679F, 0.0F, 0.0F));

		PartDefinition upperleg9_r2 = upperleg3.addOrReplaceChild("upperleg9_r2", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8866F, -0.8218F, 0.4102F, 0.0F, 0.0F));

		PartDefinition upperleg8_r3 = upperleg3.addOrReplaceChild("upperleg8_r3", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.5F, -0.9032F, -0.328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7753F, -0.5097F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = upperleg3.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.1357F, 2.1924F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg3.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(76, 5).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1692F, 1.828F, 0.1833F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8727F, 0.0061F, 0.4887F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg3.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(52, 72).mirror().addBox(-1.5F, -2.0686F, -1.3385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2737F, 8.1936F, 1.4303F, 1.8127F, 1.4251F, -0.303F));

		PartDefinition leg5_r3 = leg3.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(22, 47).mirror().addBox(-0.8F, -2.5F, -1.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4465F, 2.5773F, 0.804F, -1.5272F, -1.5184F, 1.5708F));

		PartDefinition leg5_r4 = leg3.addOrReplaceChild("leg5_r4", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.425F, -0.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8465F, 0.0786F, -0.0092F, 1.5708F, -1.5446F, -1.5708F));

		PartDefinition leg4_r5 = leg3.addOrReplaceChild("leg4_r5", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.625F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 0.4899F, -0.1802F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition leg6_r1 = leg3.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(76, 13).mirror().addBox(-0.55F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.1365F, 0.1654F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition leg6_r2 = leg3.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(70, 85).mirror().addBox(-0.0179F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false)
				.texOffs(65, 85).mirror().addBox(-0.0179F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 0.9402F, -0.6918F, 1.5708F, -1.2828F, -1.5708F));

		PartDefinition leg5_r5 = leg3.addOrReplaceChild("leg5_r5", CubeListBuilder.create().texOffs(49, 66).mirror().addBox(-0.9F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 3.7792F, 0.6775F, -1.5708F, -1.4661F, 1.5708F));

		PartDefinition leg5_r6 = leg3.addOrReplaceChild("leg5_r6", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.9F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 3.2811F, 0.6339F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg4_r6 = leg3.addOrReplaceChild("leg4_r6", CubeListBuilder.create().texOffs(85, 63).mirror().addBox(-0.9F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.5837F, 0.5729F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(30, 29).mirror().addBox(-2.9513F, -0.975F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0021F, 8.2623F, 0.9321F, -0.7375F, -0.0201F, 0.0487F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-2.9513F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0229F, -2.7873F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(40, 14).addBox(-0.5F, -0.0001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0044F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(90, 72).addBox(0.0F, -1.025F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0001F, -2.0122F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(91, 52).addBox(0.0F, -1.15F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0999F, -4.0122F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(17, 77).mirror().addBox(-3.8706F, -0.6889F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2999F, -3.5122F, 0.0988F, 0.6504F, -0.9229F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(24, 77).mirror().addBox(-1.9934F, -0.0076F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2999F, -3.5122F, 0.3408F, 0.5729F, -0.5058F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(77, 35).mirror().addBox(-1.9143F, 0.1184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.567F, 0.188F, -1.5178F, 0.3237F, 0.448F, -0.4146F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 35).addBox(-0.0857F, 0.1184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.567F, 0.188F, -1.5178F, 0.3237F, -0.448F, 0.4146F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(24, 77).addBox(-0.0066F, -0.0076F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2999F, -3.5122F, 0.3408F, -0.5729F, 0.5058F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(17, 77).addBox(1.8706F, -0.6889F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2999F, -3.5122F, 0.0988F, -0.6504F, 0.9229F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, 0.6F, 4.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7834F, -9.0796F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.0F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0001F, -4.9087F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 10).addBox(0.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(90, 62).addBox(0.0F, -1.175F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1047F, -1.1018F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 90).addBox(0.0F, -1.075F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.4F, -4.6F, 0.3451F, 0.4212F, -0.2865F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.4F, -4.6F, 0.1732F, 0.5119F, -0.6646F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(-8.1344F, -2.3955F, -0.471F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.4F, -4.6F, -0.1078F, 0.5281F, -1.2192F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-7.1344F, -2.3955F, -0.471F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, -2.6F, -0.1044F, 0.6047F, -1.3406F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, -2.6F, 0.2241F, 0.575F, -0.7615F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, -2.6F, 0.4158F, 0.4637F, -0.3794F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 11).mirror().addBox(-6.1344F, -2.3955F, -0.471F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, -0.6F, -0.0919F, 0.6472F, -1.3332F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, -0.6F, 0.2625F, 0.6048F, -0.7401F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, -0.6F, 0.4615F, 0.4795F, -0.3587F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 39).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, -0.6F, 0.4615F, -0.4795F, 0.3587F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(77, 37).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, -0.6F, 0.2625F, -0.6048F, 0.7401F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(64, 11).addBox(3.1344F, -2.3955F, -0.471F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, -0.6F, -0.0919F, -0.6472F, 1.3332F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(76, 27).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, -2.6F, 0.4158F, -0.4637F, 0.3794F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(75, 69).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, -2.6F, 0.2241F, -0.575F, 0.7615F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(58, 28).addBox(3.1344F, -2.3955F, -0.471F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, -2.6F, -0.1044F, -0.6047F, 1.3406F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(51, 11).addBox(3.1344F, -2.3955F, -0.471F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.4F, -4.6F, -0.1078F, -0.5281F, 1.2192F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(74, 55).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.4F, -4.6F, 0.1732F, -0.5119F, 0.6646F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(72, 45).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.4F, -4.6F, 0.3451F, -0.4212F, 0.2865F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(21, 16).addBox(-2.5F, 0.5975F, -0.1134F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.6342F, -4.3876F, 0.1222F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(88, 90).addBox(0.0F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3234F, -3.1169F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(90, 87).addBox(0.0F, -0.875F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(19, 0).addBox(-2.5F, 0.5996F, 0.0454F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.1597F, -3.937F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-9.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, -0.0679F, 0.4661F, -1.1658F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.315F, 0.3558F, -0.2635F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(76, 31).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.1708F, 0.4408F, -0.6313F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(39, 50).mirror().addBox(-9.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -3.6F, -0.0856F, 0.4501F, -1.1738F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(76, 33).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -3.6F, 0.1468F, 0.435F, -0.6417F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -3.6F, 0.2911F, 0.3583F, -0.2721F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 0).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.1F, -3.6F, 0.2911F, -0.3583F, 0.2721F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(76, 33).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.1F, -3.6F, 0.1468F, -0.435F, 0.6417F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(39, 50).addBox(3.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.1F, -3.6F, -0.0856F, -0.4501F, 1.1738F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(76, 31).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.1708F, -0.4408F, 0.6313F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(76, 29).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.315F, -0.3558F, 0.2635F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(39, 48).addBox(3.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, -0.0679F, -0.4661F, 1.1658F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(56, 38).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(91, 3).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(27, 52).mirror().addBox(-8.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, -0.0583F, 0.4759F, -1.1736F));

		PartDefinition cube_r107 = body4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(77, 2).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.3289F, 0.3551F, -0.2708F));

		PartDefinition cube_r108 = body4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -1.6F, 0.1845F, 0.4448F, -0.6376F));

		PartDefinition cube_r109 = body4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(10, 77).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.1845F, -0.4448F, 0.6376F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(77, 2).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, 0.3289F, -0.3551F, 0.2708F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(27, 52).addBox(3.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.6F, -0.0583F, -0.4759F, 1.1736F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(43, 43).addBox(-1.5F, 7.1667F, -1.4296F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0367F, 0.0026F, -2.9677F, -0.0915F, -0.0177F, -0.0065F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(30, 38).addBox(-0.5648F, 0.1395F, 3.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -8.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 9).addBox(0.0F, -0.9663F, 0.9801F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -2.1223F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(17, 92).addBox(0.0F, -0.8505F, -0.9862F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 6).addBox(0.0F, -1.0505F, 1.0138F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -4.1223F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(59, 77).mirror().addBox(-1.493F, 0.0479F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5675F, 0.8233F, -2.7223F, 0.5005F, 0.4834F, -0.4396F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(40, 52).mirror().addBox(-6.4194F, -0.4656F, -0.4203F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5675F, 0.8233F, -2.7223F, 0.2999F, 0.6213F, -0.8176F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(73, 77).mirror().addBox(-1.9867F, -0.0324F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3675F, 0.2233F, -0.7223F, 0.4621F, 0.4371F, -0.2718F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(-3.8558F, -0.71F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3675F, 0.2233F, -0.7223F, 0.2818F, 0.5656F, -0.6429F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-7.0923F, -2.4102F, -0.5535F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3675F, 0.2233F, -0.7223F, -0.0484F, 0.6234F, -1.2208F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 7).mirror().addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0734F, 8.2431F, -1.037F, -0.0073F, -1.2773F, -0.0374F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-5.4194F, -0.4656F, -0.4203F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5675F, 1.1233F, -4.7223F, 0.3452F, 0.659F, -0.7905F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(-1.493F, 0.0479F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5675F, 1.1233F, -4.7223F, 0.5546F, 0.5051F, -0.4139F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(51, 7).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.2431F, -1.037F, -0.0073F, 1.2773F, 0.0374F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 34).addBox(-3.8643F, 0.3353F, -3.4116F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8643F, 7.2016F, 0.6035F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(58, 30).addBox(3.0923F, -2.4102F, -0.5535F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2941F, 0.2233F, -0.7223F, -0.0484F, -0.6234F, 1.2208F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(71, 25).addBox(1.8558F, -0.71F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2941F, 0.2233F, -0.7223F, 0.2818F, -0.5656F, 0.6429F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(73, 77).addBox(-0.0133F, -0.0324F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2941F, 0.2233F, -0.7223F, 0.4621F, -0.4371F, 0.2718F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(66, 77).addBox(-0.507F, 0.0479F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.5546F, -0.5051F, 0.4139F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(7, 59).addBox(1.4194F, -0.4656F, -0.4203F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.3452F, -0.659F, 0.7905F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(40, 52).addBox(1.4194F, -0.4656F, -0.4203F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 0.8233F, -2.7223F, 0.2999F, -0.6213F, 0.8176F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(59, 77).addBox(-0.507F, 0.0479F, -0.4203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 0.8233F, -2.7223F, 0.5005F, -0.4834F, 0.4396F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(69, 61).addBox(-1.0F, -0.0359F, -0.4483F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.4202F, 4.5419F, -2.0858F, -0.4124F, 0.1485F, -0.7888F));

		PartDefinition cube_r132 = UpperArmL.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(86, 9).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.8038F, -0.6576F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r133 = UpperArmL.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.7762F, -0.891F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r134 = UpperArmL.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 85).addBox(-0.5F, -0.5952F, -0.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 5.9134F, 0.1182F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r135 = UpperArmL.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(85, 73).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(84, 22).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.6737F, 1.0068F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r136 = UpperArmL.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(80, 82).addBox(-0.5F, 0.2515F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(84, 16).addBox(-0.5F, -0.2735F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r137 = UpperArmL.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(72, 35).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r138 = UpperArmL.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(84, 19).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.035F, -0.4531F, 0.7854F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.902F, 6.6501F, 0.0425F, -0.4906F, 0.0749F, 0.7181F));

		PartDefinition cube_r139 = LowerArmL.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(74, 61).addBox(-0.5082F, -2.2519F, -0.5911F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.0349F, 1.1781F, 0.0F));

		PartDefinition cube_r140 = LowerArmL.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(74, 51).addBox(-0.5082F, -2.2001F, -0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.2094F, 1.1781F, 0.0F));

		PartDefinition cube_r141 = LowerArmL.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(62, 18).addBox(-0.5082F, -0.6607F, -0.607F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(36, 54).addBox(-0.5082F, -2.6607F, 0.243F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.0F, 1.1781F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(13, 43).addBox(-2.5F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1473F, 6.349F, 0.6625F, 0.6916F, -0.3708F, -0.1464F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(21, 23).addBox(-3.0F, -1.0F, -3.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.0087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(69, 61).mirror().addBox(0.0F, -0.0359F, -0.4483F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4937F, 4.5419F, -2.0858F, 0.5039F, -0.1485F, 0.7888F));

		PartDefinition cube_r142 = UpperArmL2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.8038F, -0.6576F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r143 = UpperArmL2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.5F, 0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.7762F, -0.891F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r144 = UpperArmL2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(75, 85).mirror().addBox(-0.5F, -0.5952F, -0.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.9134F, 0.1182F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r145 = UpperArmL2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(85, 73).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(84, 22).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.6737F, 1.0068F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r146 = UpperArmL2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(-0.5F, 0.2515F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(84, 16).mirror().addBox(-0.5F, -0.2735F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r147 = UpperArmL2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r148 = UpperArmL2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.035F, -0.4531F, 0.7854F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.902F, 6.6501F, 0.0425F, -0.7791F, -0.1988F, -0.8423F));

		PartDefinition cube_r149 = LowerArmL2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-0.4918F, -2.2519F, -0.5911F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.0349F, -1.1781F, 0.0F));

		PartDefinition cube_r150 = LowerArmL2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.4918F, -2.2001F, -0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.2094F, -1.1781F, 0.0F));

		PartDefinition cube_r151 = LowerArmL2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-0.4918F, -0.6607F, -0.607F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(36, 54).mirror().addBox(-0.4918F, -2.6607F, 0.243F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.0F, -1.1781F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(13, 43).mirror().addBox(-2.5F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1473F, 6.349F, 0.6625F, 0.3425F, 0.3708F, 0.1464F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create().texOffs(21, 23).mirror().addBox(-2.0F, -1.0F, -3.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.7894F, 6.9489F, -4.2662F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(21, 63).addBox(-0.5F, -1.475F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0349F, -1.9161F, 1.9608F, 0.5116F, 0.0258F, -0.1343F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(14, 63).addBox(-0.4985F, -1.4639F, -1.0698F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.3807F, 0.0258F, -0.1343F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(40, 87).addBox(-0.5F, 1.1067F, -0.7275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3292F, -5.6624F, 2.9814F, 2.5361F, 0.0258F, -0.047F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.0149F, -0.118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3292F, -5.6624F, 2.9814F, 1.5762F, 0.0258F, -0.047F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(41, 59).addBox(-0.5F, -1.7993F, -1.4483F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3292F, -5.6624F, 2.9814F, 0.3108F, 0.0258F, -0.047F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(57, 72).addBox(-0.5F, -0.1799F, -1.4437F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3292F, -5.6624F, 2.9814F, -0.1255F, 0.0258F, -0.047F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(9, 53).addBox(-1.0F, 0.5F, 0.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4337F, -1.7425F, -0.3261F, -0.1374F, 0.1635F, 0.7768F));

		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(28, 45).addBox(-1.0F, 0.7F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4337F, -1.7425F, -0.3261F, 0.1244F, 0.1635F, 0.7768F));

		PartDefinition cube_r160 = bone2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(62, 52).addBox(-0.4985F, -0.3211F, -1.5022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, -0.1866F, 0.0258F, -0.1343F));

		PartDefinition cube_r161 = bone2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3307F, -5.8547F, 3.2996F, 1.1623F, 0.0963F, -0.1105F));

		PartDefinition cube_r162 = bone2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(41, 54).addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3121F, -6.6224F, 4.3675F, 0.7696F, 0.0963F, -0.1105F));

		PartDefinition cube_r163 = bone2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(14, 68).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(67, 18).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.9935F, -0.1131F, -1.4558F, -0.7599F, 0.059F, 0.2795F));

		PartDefinition cube_r164 = bone2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(80, 85).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.2318F, 0.9652F, -0.298F, -1.5453F, 0.059F, 0.2795F));

		PartDefinition cube_r165 = bone2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(35, 79).addBox(-0.5F, -0.2F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 77).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.587F, -1.6118F, -1.8412F, 0.2437F, 0.059F, 0.2795F));

		PartDefinition cube_r166 = bone2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(86, 12).addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(10, 86).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4185F, -2.1634F, -1.6757F, 1.2909F, 0.059F, 0.2795F));

		PartDefinition cube_r167 = bone2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(53, 23).addBox(-0.5F, -0.125F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0507F, -3.0808F, -0.8279F, 1.0394F, 0.1582F, 0.244F));

		PartDefinition cube_r168 = bone2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(53, 18).addBox(-0.5F, -0.275F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0507F, -3.0808F, -0.8279F, 0.9085F, 0.1582F, 0.244F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.8628F, 6.9489F, -4.2662F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.5F, -1.475F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0349F, -1.9161F, 1.9608F, 0.5116F, -0.0258F, 0.1343F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.5015F, -1.4639F, -1.0698F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.3807F, -0.0258F, 0.1343F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.5F, 1.1067F, -0.7275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3292F, -5.6624F, 2.9814F, 2.5361F, -0.0258F, 0.047F));

		PartDefinition cube_r172 = bone4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -0.0149F, -0.118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3292F, -5.6624F, 2.9814F, 1.5762F, -0.0258F, 0.047F));

		PartDefinition cube_r173 = bone4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(41, 59).mirror().addBox(-0.5F, -1.7993F, -1.4483F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3292F, -5.6624F, 2.9814F, 0.3108F, -0.0258F, 0.047F));

		PartDefinition cube_r174 = bone4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.5F, -0.1799F, -1.4437F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3292F, -5.6624F, 2.9814F, -0.1255F, -0.0258F, 0.047F));

		PartDefinition cube_r175 = bone4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(0.0F, 0.5F, 0.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -1.7425F, -0.3261F, -0.1374F, -0.1635F, -0.7768F));

		PartDefinition cube_r176 = bone4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(28, 45).mirror().addBox(0.0F, 0.7F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -1.7425F, -0.3261F, 0.1244F, -0.1635F, -0.7768F));

		PartDefinition cube_r177 = bone4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(62, 52).mirror().addBox(-0.5015F, -0.3211F, -1.5022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, -0.1866F, -0.0258F, 0.1343F));

		PartDefinition cube_r178 = bone4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.3307F, -5.8547F, 3.2996F, 1.1623F, -0.0963F, 0.1105F));

		PartDefinition cube_r179 = bone4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(41, 54).mirror().addBox(-0.5F, -0.2F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3121F, -6.6224F, 4.3675F, 0.7696F, -0.0963F, 0.1105F));

		PartDefinition cube_r180 = bone4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 18).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.9935F, -0.1131F, -1.4558F, -0.7599F, -0.059F, -0.2795F));

		PartDefinition cube_r181 = bone4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.2318F, 0.9652F, -0.298F, -1.5453F, -0.059F, -0.2795F));

		PartDefinition cube_r182 = bone4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.5F, -0.2F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 77).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.587F, -1.6118F, -1.8412F, 0.2437F, -0.059F, -0.2795F));

		PartDefinition cube_r183 = bone4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(10, 86).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4185F, -2.1634F, -1.6757F, 1.2909F, -0.059F, -0.2795F));

		PartDefinition cube_r184 = bone4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-0.5F, -0.125F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0507F, -3.0808F, -0.8279F, 1.0394F, -0.1582F, -0.244F));

		PartDefinition cube_r185 = bone4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-0.5F, -0.275F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0507F, -3.0808F, -0.8279F, 0.9085F, -0.1582F, -0.244F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.3519F, -4.8154F, 0.0093F, 0.3479F, 0.0063F));

		PartDefinition cube_r186 = neck3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(91, 12).addBox(0.5F, -0.7805F, -1.0119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5965F, -1.179F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r187 = neck3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-3.9552F, 0.2397F, 0.1253F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5523F, -0.0832F, -2.2737F, 0.1437F, 0.6038F, -0.7297F));

		PartDefinition cube_r188 = neck3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(58, 32).addBox(-0.0448F, 0.2397F, 0.1253F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4907F, -0.0832F, -2.2737F, 0.1437F, -0.6038F, 0.7297F));

		PartDefinition cube_r189 = neck3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(53, 13).addBox(-0.0648F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.35F, -2.95F, 0.1372F, 0.305F, 0.0377F));

		PartDefinition cube_r190 = neck2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(14, 92).addBox(0.5F, -0.7305F, -0.0119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3299F, -3.1662F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r191 = neck2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(11, 92).addBox(0.5F, -0.7805F, -0.0119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1035F, -1.1791F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(62, 25).mirror().addBox(-2.6552F, 0.0397F, -0.5748F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2616F, 0.4714F, -0.5069F, 0.0425F, 0.5724F, -0.7675F));

		PartDefinition cube_r193 = neck2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(37, 77).mirror().addBox(-2.0552F, 0.0397F, -0.5748F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2616F, 0.4714F, -2.5069F, 0.014F, 0.5771F, -0.884F));

		PartDefinition cube_r194 = neck2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(37, 77).addBox(0.0552F, 0.0397F, -0.5748F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.4714F, -2.5069F, 0.014F, -0.5771F, 0.884F));

		PartDefinition cube_r195 = neck2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(62, 25).addBox(-0.3448F, 0.0397F, -0.5748F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.4714F, -0.5069F, 0.0425F, -0.5724F, 0.7675F));

		PartDefinition cube_r196 = neck2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(47, 28).addBox(-0.0648F, -1.8046F, 0.876F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0196F, 2.4034F, -3.9823F, -0.0611F, -0.001F, 0.0036F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(83, 28).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.061F, 1.0293F, -12.1554F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(84, 60).addBox(-0.567F, -0.175F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, 1.1209F, -11.9481F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(84, 50).addBox(-0.567F, -0.3F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(50, 84).addBox(-0.567F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0059F, 0.0455F, -11.9781F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(18, 57).addBox(-1.5154F, -4.0F, 0.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4651F, 0.2522F, -0.0702F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(11, 47).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0503F, -2.1773F, -2.8638F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(53, 52).addBox(-2.0154F, -2.5F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9651F, -1.7259F, 0.2255F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(47, 34).addBox(-2.5154F, -1.3F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -1.7259F, 0.2255F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(83, 25).addBox(-0.5154F, 0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(25, 83).addBox(-0.5154F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -3.3325F, -0.39F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(45, 84).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -0.5058F, -11.6265F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(79, 51).addBox(-0.5F, -1.4225F, -0.3785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -1.3789F, -10.0866F, 2.1642F, -0.0004F, 0.0009F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(60, 82).addBox(-0.5F, -0.439F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -1.3789F, -10.0866F, -2.6791F, -0.0004F, 0.0009F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(40, 84).addBox(-0.5F, -1.4225F, -0.6214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -1.3789F, -10.0866F, -1.2392F, -0.0004F, 0.0009F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(65, 37).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -1.9751F, -8.4174F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, 0.51F, -12.1048F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(27, 54).addBox(-1.5F, -3.175F, 0.8F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, 1.4834F, -5.8204F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(43, 38).addBox(-2.5F, -1.7F, 0.325F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, 0.3235F, -4.4808F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(28, 68).addBox(0.0F, 0.0F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.561F, -2.9026F, -2.6351F, -2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(21, 68).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.561F, -3.465F, -4.7993F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(85, 81).addBox(-0.5F, -0.975F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 59).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.061F, -3.3865F, -5.7962F, -3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(48, 61).addBox(-1.0F, -0.9111F, -0.4893F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -2.2079F, -7.5948F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(84, 37).addBox(-0.9F, 0.825F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4544F, -3.7472F, -1.3F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5154F, -0.775F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0456F, -2.4199F, -0.2565F, -0.4276F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1277F, 2.3692F, -11.1683F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(54, 48).addBox(-2.7034F, 1.5156F, -0.651F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(62, 63).addBox(-1.7034F, 0.5156F, -1.651F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2969F, -3.2585F, 4.2992F, 1.7539F, 0.2395F, -0.0252F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(59, 57).addBox(-0.5F, -2.6F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.828F, -2.8123F, 3.8534F, 1.0494F, 0.555F, 0.0823F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(60, 34).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7675F, -5.8744F, 6.1442F, 1.2115F, 0.4626F, -0.1591F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(61, 68).addBox(-2.0F, 0.175F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8376F, -4.7122F, 4.2297F, -1.1275F, 0.4334F, -0.1961F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(50, 57).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2993F, -6.1554F, 5.3064F, 0.2991F, 0.5359F, -0.1428F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(20, 86).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1564F, -5.2477F, 6.8195F, 1.334F, 0.8833F, -1.6585F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(15, 86).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9619F, -5.561F, 6.4818F, 2.4013F, 0.4161F, -0.1388F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(12, 72).addBox(-0.9783F, -0.6934F, -3.2493F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2969F, -3.2585F, 4.2992F, -3.0526F, 0.32F, -0.0922F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(72, 72).addBox(-1.0252F, -0.2495F, -1.7939F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2969F, -3.2585F, 4.2992F, 2.523F, 0.3285F, -0.0796F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(5, 79).addBox(-0.6819F, -0.0077F, -0.9562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2969F, -3.2585F, 4.2992F, 1.8959F, 0.2418F, 0.0022F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(20, 79).addBox(-0.948F, -1.9903F, -0.7343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.616F, -3.0599F, 4.4379F, 1.6473F, 0.5029F, 0.087F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(15, 79).addBox(-0.948F, -0.2868F, -0.857F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.616F, -3.0599F, 4.4379F, 1.0748F, 0.3462F, 0.0743F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1489F, -1.0014F, 4.8028F, 0.5331F, 0.3458F, 0.0262F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(63, 48).addBox(-0.5F, -0.975F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1479F, -0.9224F, 4.8055F, 1.9293F, 0.3458F, 0.0262F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(84, 34).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5794F, -1.3448F, 5.4485F, 2.1331F, 0.4144F, 0.0467F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(85, 84).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2708F, -1.0183F, 4.7823F, 1.915F, 0.4144F, 0.0467F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(60, 88).addBox(-0.475F, 0.6966F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 82).addBox(-0.475F, -0.1034F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4432F, -0.6361F, 3.0058F, 1.7841F, 0.4144F, 0.0467F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(35, 86).addBox(-0.525F, -0.8935F, -0.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4432F, -0.6361F, 3.0058F, 1.6532F, 0.4144F, 0.0467F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(15, 89).addBox(-0.9435F, -1.0138F, -0.4884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5853F, -0.552F, 2.2488F, 1.6054F, 0.3316F, 0.0452F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(89, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1827F, -1.2135F, 0.0141F, -1.9645F, 0.3027F, -1.5984F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(30, 89).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6793F, -2.2211F, -0.4739F, -1.9577F, 0.7578F, -1.7318F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(84, 78).addBox(-0.4212F, -0.2351F, -0.2518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2696F, -2.5593F, -0.6466F, -1.7703F, 0.524F, 0.0653F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(25, 89).addBox(-0.3855F, -0.0021F, -0.423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2696F, -2.5593F, -0.6466F, -0.744F, 0.5979F, 0.072F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(64, 79).addBox(-0.4861F, -0.8969F, -0.423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 61).addBox(-0.4861F, -0.3969F, -0.423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 81).addBox(-0.4861F, -0.8969F, -0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(80, 75).addBox(-0.4861F, -0.3969F, -0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.2696F, -2.5593F, -0.6466F, -0.8642F, 0.3575F, -0.1866F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(80, 64).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2411F, -2.9264F, -1.0312F, -0.8907F, 0.4818F, -0.1973F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(83, 57).addBox(-0.9121F, 1.9381F, -0.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7312F, -4.3345F, 0.9391F, -0.778F, 0.1917F, 0.1373F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(40, 81).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4726F, -3.4892F, -0.3495F, -1.0288F, 0.4419F, -0.2404F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(89, 21).addBox(-0.9121F, 0.9726F, -0.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7312F, -4.2595F, 0.8891F, -0.9089F, 0.1917F, 0.1373F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(45, 90).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5891F, -3.7833F, 0.0376F, -1.1495F, -0.6905F, -1.0058F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(20, 89).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6541F, -4.032F, 0.4665F, -1.2186F, 0.4183F, -0.5795F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(55, 88).addBox(-1.0142F, -0.0144F, -0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7312F, -4.2595F, 0.8891F, -1.0407F, 0.1087F, 0.0726F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(44, 77).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2169F, -3.0803F, 0.3725F, 2.6622F, 0.7352F, -1.6476F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(77, 41).addBox(-1.9F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2169F, -3.0803F, 0.3725F, 2.7504F, 0.4576F, -1.4924F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(54, 68).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2169F, -3.0803F, 0.3725F, 1.4414F, 0.4576F, -1.4924F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(70, 48).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8229F, -2.424F, -0.2709F, 2.7999F, 0.819F, -1.4833F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(67, 22).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4727F, -3.6541F, 1.0877F, 1.4123F, 0.6425F, -1.3639F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(65, 45).addBox(-2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5143F, -3.8468F, 1.5472F, 0.0148F, 0.4051F, -1.3202F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(88, 31).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7174F, -4.2801F, 0.8937F, 0.311F, -0.8839F, -1.1223F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(35, 83).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7591F, -4.4728F, 1.3531F, 0.2081F, 0.3504F, -0.8063F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 69).addBox(-1.3693F, -0.6669F, -6.5942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6267F, -6.191F, 7.1854F, 0.3993F, 0.0721F, 0.044F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(40, 70).addBox(-2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5945F, -4.1313F, 2.3799F, -0.0277F, 0.2355F, -1.3297F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(83, 31).addBox(-1.535F, -0.6172F, -0.145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6267F, -4.691F, 1.8854F, 0.086F, 0.2212F, -0.8369F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(82, 70).addBox(-1.8167F, 0.0132F, -0.145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6267F, -4.691F, 1.8854F, 0.2245F, 0.0769F, 0.0348F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(35, 70).addBox(-0.475F, -0.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8828F, -4.9779F, 4.8538F, -1.2467F, 0.2125F, 0.0508F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(15, 83).addBox(-0.7F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(10, 83).addBox(-1.0F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7629F, -5.1325F, 5.305F, -2.4332F, -0.904F, -0.6547F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(81, 7).addBox(-1.0659F, -0.1276F, -0.5926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5853F, -0.552F, 2.2488F, -3.0639F, 0.3479F, 0.036F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(69, 27).addBox(-1.0659F, -0.3838F, 1.3351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5853F, -0.552F, 2.2488F, 2.8877F, 0.3479F, 0.036F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(79, 79).addBox(-1.0659F, -0.2063F, 0.3738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5853F, -0.552F, 2.2488F, 3.0186F, 0.3479F, 0.036F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(89, 59).addBox(-0.1616F, -0.5087F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 90).addBox(-0.5616F, -0.5087F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 90).addBox(-0.9616F, -0.5087F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 76).addBox(-0.9616F, -0.5087F, -0.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0845F, -0.704F, -1.0888F, -2.4396F, 0.1448F, 1.9056F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(89, 49).addBox(-0.2943F, -0.5087F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0845F, -0.704F, -1.0888F, -1.6585F, 0.8745F, -3.0424F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(35, 89).addBox(-0.6497F, -0.5087F, -0.7031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0845F, -0.704F, -1.0888F, -0.7084F, 0.1897F, -1.5176F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(89, 37).addBox(-0.7503F, -0.4836F, -0.0617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0845F, -0.704F, -1.0888F, -0.8885F, -0.8669F, -0.508F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(89, 34).addBox(-0.8778F, -0.4836F, 0.2257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0845F, -0.704F, -1.0888F, -0.7281F, -0.7154F, -0.7324F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(30, 83).addBox(-0.4985F, -0.5087F, -1.3081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0845F, -0.704F, -1.0888F, -1.2379F, -0.8284F, -0.2254F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(89, 18).addBox(-0.6369F, -0.5087F, -1.2411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0845F, -0.704F, -1.0888F, -1.5878F, -0.8775F, 0.2355F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -2.3F, -1.7F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2901F, -4.0677F, 11.2215F, 1.1959F, 0.0698F, -0.0119F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(69, 31).addBox(-0.9979F, 3.0978F, -2.0772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 1.7632F, 0.0698F, -0.0119F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(75, 88).addBox(-0.9979F, -0.857F, -5.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F))
				.texOffs(70, 88).addBox(-0.9979F, -0.857F, -4.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 2.6795F, 0.0698F, -0.0119F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(88, 56).addBox(-0.9979F, 1.5076F, -4.8404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 2.1995F, 0.0698F, -0.0119F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(65, 88).addBox(-0.9979F, 3.5495F, -3.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 1.6759F, 0.0698F, -0.0119F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(30, 79).addBox(-0.9979F, 2.2592F, 1.8826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 0.6287F, 0.0698F, -0.0119F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(25, 79).addBox(-0.9979F, 1.2936F, 2.7019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 0.236F, 0.0698F, -0.0119F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(67, 72).addBox(-0.5F, -1.5F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9236F, -4.5258F, 8.6144F, 1.8003F, 0.1846F, -0.1061F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(56, 43).addBox(-0.6F, -0.7F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6281F, -5.2242F, 10.9983F, 2.6008F, 0.9947F, -0.4132F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(5, 89).addBox(-0.5F, -0.3246F, -1.1635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0922F, -5.2032F, 10.6956F, 2.4113F, 0.1322F, -0.0014F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -0.5431F, -0.4764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0922F, -5.2032F, 10.6956F, 1.3204F, 0.1322F, -0.0014F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(80, 88).addBox(-0.5F, -0.5575F, 0.1839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0922F, -5.2032F, 10.6956F, 2.5858F, 0.1322F, -0.0014F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(62, 72).addBox(-0.65F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.9469F, -5.5291F, 8.4901F, 1.6694F, 0.1846F, -0.1061F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(60, 0).addBox(-0.9979F, -0.0664F, -1.0232F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3969F, -3.2585F, 7.3992F, 1.8068F, 0.0698F, -0.0119F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(47, 72).addBox(-0.9979F, 0.7155F, 0.5053F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 1.065F, 0.0698F, -0.0119F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(79, 21).addBox(-0.9422F, 0.961F, 2.0907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.5469F, -3.4585F, 7.6492F, 0.7567F, 0.0558F, -0.0734F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(69, 13).addBox(-0.9202F, -1.963F, 1.1646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.3969F, -3.2585F, 7.3992F, -0.1619F, 0.0488F, -0.1165F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 10).addBox(-1.3662F, 1.02F, -0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.216F, -0.5584F, 0.9912F, 1.6463F, 0.5232F, 0.0379F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -1.5F, -1.325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0552F, -1.5269F, 2.4673F, 2.0099F, 0.0211F, 1.2642F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(28, 63).addBox(-1.0F, -1.4F, 0.375F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5544F, -0.7844F, 3.4494F, 1.7907F, 0.3144F, 0.1748F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(70, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4233F, -0.462F, 3.0784F, 1.8114F, 0.4243F, 0.0196F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2284F, 2.3692F, -11.1683F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(-0.2966F, 1.5156F, -0.651F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(62, 63).mirror().addBox(-0.2966F, 0.5156F, -1.651F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2969F, -3.2585F, 4.2992F, 1.7539F, -0.2395F, 0.0252F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(59, 57).mirror().addBox(-0.5F, -2.6F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.828F, -2.8123F, 3.8534F, 1.0494F, -0.555F, -0.0823F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(60, 34).mirror().addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7675F, -5.8744F, 6.1442F, 1.2115F, -0.4626F, 0.1591F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(61, 68).mirror().addBox(0.0F, 0.175F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8376F, -4.7122F, 4.2297F, -1.1275F, -0.4334F, 0.1961F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2993F, -6.1554F, 5.3064F, 0.2991F, -0.5359F, 0.1428F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1564F, -5.2477F, 6.8195F, 1.334F, -0.8833F, 1.6585F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, -5.561F, 6.4818F, 2.4013F, -0.4161F, 0.1388F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(12, 72).mirror().addBox(-0.0217F, -0.6934F, -3.2493F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2969F, -3.2585F, 4.2992F, -3.0526F, -0.32F, 0.0922F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(0.0252F, -0.2495F, -1.7939F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2969F, -3.2585F, 4.2992F, 2.523F, -0.3285F, 0.0796F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.3181F, -0.0077F, -0.9562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2969F, -3.2585F, 4.2992F, 1.8959F, -0.2418F, -0.0022F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-0.052F, -1.9903F, -0.7343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.616F, -3.0599F, 4.4379F, 1.6473F, -0.5029F, -0.087F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.052F, -0.2868F, -0.857F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.616F, -3.0599F, 4.4379F, 1.0748F, -0.3462F, -0.0743F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1489F, -1.0014F, 4.8028F, 0.5331F, -0.3458F, -0.0262F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-0.5F, -0.975F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1479F, -0.9224F, 4.8055F, 1.9293F, -0.3458F, -0.0262F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5794F, -1.3448F, 5.4485F, 2.1331F, -0.4144F, -0.0467F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2708F, -1.0183F, 4.7823F, 1.915F, -0.4144F, -0.0467F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(-0.525F, 0.6966F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 82).mirror().addBox(-0.525F, -0.1034F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4432F, -0.6361F, 3.0058F, 1.7841F, -0.4144F, -0.0467F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.475F, -0.8935F, -0.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4432F, -0.6361F, 3.0058F, 1.6532F, -0.4144F, -0.0467F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-0.0565F, -1.0138F, -0.4884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5853F, -0.552F, 2.2488F, 1.6054F, -0.3316F, -0.0452F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1827F, -1.2135F, 0.0141F, -1.9645F, -0.3027F, 1.5984F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6793F, -2.2211F, -0.4739F, -1.9577F, -0.7578F, 1.7318F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(84, 78).mirror().addBox(-0.5788F, -0.2351F, -0.2518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2696F, -2.5593F, -0.6466F, -1.7703F, -0.524F, -0.0653F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-0.6145F, -0.0021F, -0.423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2696F, -2.5593F, -0.6466F, -0.744F, -0.5979F, -0.072F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-0.5139F, -0.8969F, -0.423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 61).mirror().addBox(-0.5139F, -0.3969F, -0.423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 81).mirror().addBox(-0.5139F, -0.8969F, -0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(80, 75).mirror().addBox(-0.5139F, -0.3969F, -0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.2696F, -2.5593F, -0.6466F, -0.8642F, -0.3575F, 0.1866F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2411F, -2.9264F, -1.0312F, -0.8907F, -0.4818F, 0.1973F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(83, 57).mirror().addBox(-0.0879F, 1.9381F, -0.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7312F, -4.3345F, 0.9391F, -0.778F, -0.1917F, -0.1373F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4726F, -3.4892F, -0.3495F, -1.0288F, -0.4419F, 0.2404F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(-0.0879F, 0.9726F, -0.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7312F, -4.2595F, 0.8891F, -0.9089F, -0.1917F, -0.1373F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(45, 90).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5891F, -3.7833F, 0.0376F, -1.1495F, 0.6905F, 1.0058F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6541F, -4.032F, 0.4665F, -1.2186F, -0.4183F, 0.5795F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(55, 88).mirror().addBox(0.0142F, -0.0144F, -0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7312F, -4.2595F, 0.8891F, -1.0407F, -0.1087F, -0.0726F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(44, 77).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2169F, -3.0803F, 0.3725F, 2.6622F, -0.7352F, 1.6476F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(77, 41).mirror().addBox(0.9F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2169F, -3.0803F, 0.3725F, 2.7504F, -0.4576F, 1.4924F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(54, 68).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2169F, -3.0803F, 0.3725F, 1.4414F, -0.4576F, 1.4924F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(70, 48).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8229F, -2.424F, -0.2709F, 2.7999F, -0.819F, 1.4833F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(67, 22).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4727F, -3.6541F, 1.0877F, 1.4123F, -0.6425F, 1.3639F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(65, 45).mirror().addBox(0.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5143F, -3.8468F, 1.5472F, 0.0148F, -0.4051F, 1.3202F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7174F, -4.2801F, 0.8937F, 0.311F, 0.8839F, 1.1223F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7591F, -4.4728F, 1.3531F, 0.2081F, -0.3504F, 0.8063F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(87, 69).mirror().addBox(0.3693F, -0.6669F, -6.5942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6267F, -6.191F, 7.1854F, 0.3993F, -0.0721F, -0.044F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(0.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5945F, -4.1313F, 2.3799F, -0.0277F, -0.2355F, 1.3297F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(0.535F, -0.6172F, -0.145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6267F, -4.691F, 1.8854F, 0.086F, -0.2212F, 0.8369F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(0.8167F, 0.0132F, -0.145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6267F, -4.691F, 1.8854F, 0.2245F, -0.0769F, -0.0348F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-0.525F, -0.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, -4.9779F, 4.8538F, -1.2467F, -0.2125F, -0.0508F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.3F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(10, 83).mirror().addBox(0.0F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7629F, -5.1325F, 5.305F, -2.4332F, 0.904F, 0.6547F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(81, 7).mirror().addBox(0.0659F, -0.1276F, -0.5926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5853F, -0.552F, 2.2488F, -3.0639F, -0.3479F, -0.036F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(0.0659F, -0.3838F, 1.3351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5853F, -0.552F, 2.2488F, 2.8877F, -0.3479F, -0.036F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(0.0659F, -0.2063F, 0.3738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5853F, -0.552F, 2.2488F, 3.0186F, -0.3479F, -0.036F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-0.8384F, -0.5087F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 90).mirror().addBox(-0.4384F, -0.5087F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 90).mirror().addBox(-0.0384F, -0.5087F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 76).mirror().addBox(-0.0384F, -0.5087F, -0.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0845F, -0.704F, -1.0888F, -2.4396F, -0.1448F, -1.9056F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-0.7057F, -0.5087F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0845F, -0.704F, -1.0888F, -1.6585F, -0.8745F, 3.0424F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.3503F, -0.5087F, -0.7031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0845F, -0.704F, -1.0888F, -0.7084F, -0.1897F, 1.5176F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(-0.2497F, -0.4836F, -0.0617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0845F, -0.704F, -1.0888F, -0.8885F, 0.8669F, 0.508F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-0.1222F, -0.4836F, 0.2257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0845F, -0.704F, -1.0888F, -0.7281F, 0.7154F, 0.7324F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(-0.5015F, -0.5087F, -1.3081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0845F, -0.704F, -1.0888F, -1.2379F, 0.8284F, 0.2254F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-0.363F, -0.5087F, -1.2411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0845F, -0.704F, -1.0888F, -1.5878F, 0.8775F, -0.2355F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.5F, -2.3F, -1.7F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.2901F, -4.0677F, 11.2215F, 1.1959F, -0.0698F, 0.0119F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(69, 31).mirror().addBox(-0.0021F, 3.0978F, -2.0772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 1.7632F, -0.0698F, 0.0119F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(75, 88).mirror().addBox(-0.0021F, -0.857F, -5.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)).mirror(false)
				.texOffs(70, 88).mirror().addBox(-0.0021F, -0.857F, -4.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 2.6795F, -0.0698F, 0.0119F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-0.0021F, 1.5076F, -4.8404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 2.1995F, -0.0698F, 0.0119F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(65, 88).mirror().addBox(-0.0021F, 3.5495F, -3.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 1.6759F, -0.0698F, 0.0119F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.0021F, 2.2592F, 1.8826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 0.6287F, -0.0698F, 0.0119F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-0.0021F, 1.2936F, 2.7019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 0.236F, -0.0698F, 0.0119F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(67, 72).mirror().addBox(-0.5F, -1.5F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9236F, -4.5258F, 8.6144F, 1.8003F, -0.1846F, 0.1061F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-0.4F, -0.7F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6281F, -5.2242F, 10.9983F, 2.6008F, -0.9947F, 0.4132F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.5F, -0.3246F, -1.1635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0922F, -5.2032F, 10.6956F, 2.4113F, -0.1322F, 0.0014F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.5F, -0.5431F, -0.4764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0922F, -5.2032F, 10.6956F, 1.3204F, -0.1322F, 0.0014F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(80, 88).mirror().addBox(-0.5F, -0.5575F, 0.1839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0922F, -5.2032F, 10.6956F, 2.5858F, -0.1322F, 0.0014F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-0.35F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9469F, -5.5291F, 8.4901F, 1.6694F, -0.1846F, 0.1061F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.0021F, -0.0664F, -1.0232F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3969F, -3.2585F, 7.3992F, 1.8068F, -0.0698F, 0.0119F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(47, 72).mirror().addBox(-0.0021F, 0.7155F, 0.5053F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 1.065F, -0.0698F, 0.0119F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.0578F, 0.961F, 2.0907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.5469F, -3.4585F, 7.6492F, 0.7567F, -0.0558F, 0.0734F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(-0.0798F, -1.963F, 1.1646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.3969F, -3.2585F, 7.3992F, -0.1619F, -0.0488F, 0.1165F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(81, 10).mirror().addBox(0.3662F, 1.02F, -0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.216F, -0.5584F, 0.9912F, 1.6463F, -0.5232F, -0.0379F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(0.0F, -1.5F, -1.325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0552F, -1.5269F, 2.4673F, 2.0099F, -0.0211F, -1.2642F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(28, 63).mirror().addBox(-1.0F, -1.4F, 0.375F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5544F, -0.7844F, 3.4494F, 1.7907F, -0.3144F, -0.1748F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, -0.462F, 3.0784F, 1.8114F, -0.4243F, -0.0196F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9543F, 1.1008F, 0.0295F, 1.1692F, 0.0F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(87, 46).mirror().addBox(-0.0002F, -1.063F, 0.5559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 2.4745F, -0.1212F, -0.0921F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(85, 87).mirror().addBox(-0.0002F, -0.9167F, -0.2366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 2.3436F, -0.1212F, -0.0921F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(0.0254F, 0.3809F, 0.2173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -1.8461F, -0.1414F, -0.0764F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(49, 77).mirror().addBox(-0.1405F, -0.4898F, -3.11F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -0.4096F, -0.2086F, -0.057F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-0.1124F, -4.8842F, -2.4466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 0.8839F, -0.1945F, -0.0245F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(-0.0002F, -0.2155F, 0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(30, 86).mirror().addBox(-0.0002F, -1.2155F, 0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -1.4961F, -0.1212F, -0.0921F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(88, 25).mirror().addBox(-0.0002F, -0.7353F, 0.5539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 2.6141F, -0.1212F, -0.0921F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(32, 75).mirror().addBox(-0.1355F, -4.4268F, -1.5753F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 0.631F, -0.2155F, -0.0666F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(-0.1355F, -4.6772F, -0.9105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 0.9801F, -0.2155F, -0.0666F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(55, 85).mirror().addBox(-0.1355F, -2.3994F, -1.6806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 0.5874F, -0.2155F, -0.0666F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(60, 85).mirror().addBox(-0.1355F, -2.4989F, -0.565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 1.1546F, -0.2155F, -0.0666F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.2304F, -1.7043F, -5.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -0.4278F, -0.2287F, -0.0499F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-0.1405F, -3.8863F, -1.9032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 1.0303F, -0.2086F, -0.057F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-0.1405F, -2.2347F, 3.7056F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 2.5139F, -0.2086F, -0.057F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-1.3942F, 5.4687F, 0.3894F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -2.2718F, -0.3816F, 0.1078F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-1.3942F, 1.0313F, -9.232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -0.7882F, -0.3816F, 0.1078F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-1.3942F, -9.9327F, -3.8244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 0.6953F, -0.3816F, 0.1078F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(87, 40).mirror().addBox(-1.3942F, -8.5622F, 6.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(45, 87).mirror().addBox(-1.3942F, -9.1872F, 6.4473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 1.6989F, -0.3816F, 0.1078F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-1.3942F, -6.0104F, 9.2574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 2.0043F, -0.3816F, 0.1078F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-1.3942F, -12.2374F, -1.728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 0.8175F, -0.3816F, 0.1078F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-1.3942F, -1.3303F, 10.721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, 2.4843F, -0.3816F, 0.1078F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-1.3942F, 5.3759F, -1.2363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(72, 40).mirror().addBox(-1.3942F, 5.3759F, -1.5363F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -2.0536F, -0.3816F, 0.1078F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-0.1405F, 3.8212F, -3.7076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6093F, 0.4034F, 0.3949F, -1.544F, -0.2086F, -0.057F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 84).addBox(-0.7696F, -1.7043F, -5.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -0.4278F, 0.2287F, 0.0499F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(60, 85).addBox(-0.8645F, -2.4989F, -0.565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 1.1546F, 0.2155F, 0.0666F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(55, 85).addBox(-0.8645F, -2.3994F, -1.6806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 0.5874F, 0.2155F, 0.0666F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(75, 65).addBox(-0.8645F, -4.6772F, -0.9105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 0.9801F, 0.2155F, 0.0666F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(32, 75).addBox(-0.8645F, -4.4268F, -1.5753F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 0.631F, 0.2155F, 0.0666F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(88, 25).addBox(-0.9998F, -0.7353F, 0.5539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 2.6141F, 0.1212F, 0.0921F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(30, 86).addBox(-0.9998F, -1.2155F, 0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(88, 28).addBox(-0.9998F, -0.2155F, 0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -1.4961F, 0.1212F, 0.0921F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(68, 68).addBox(-0.8876F, -4.8842F, -2.4466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 0.8839F, 0.1945F, 0.0245F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(7, 70).addBox(0.3942F, -12.2374F, -1.728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 0.8175F, 0.3816F, -0.1078F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(87, 43).addBox(0.3942F, -6.0104F, 9.2574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 2.0043F, 0.3816F, -0.1078F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(10, 89).addBox(0.3942F, -1.3303F, 10.721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 2.4843F, 0.3816F, -0.1078F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(45, 87).addBox(0.3942F, -9.1872F, 6.4473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(87, 40).addBox(0.3942F, -8.5622F, 6.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 1.6989F, 0.3816F, -0.1078F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(87, 66).addBox(0.3942F, -9.9327F, -3.8244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 0.6953F, 0.3816F, -0.1078F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(35, 65).addBox(0.3942F, 1.0313F, -9.232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -0.7882F, 0.3816F, -0.1078F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(50, 87).addBox(-0.8595F, 3.8212F, -3.7076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -1.544F, 0.2086F, 0.057F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(72, 40).addBox(0.3942F, 5.3759F, -1.5363F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 79).addBox(0.3942F, 5.3759F, -1.2363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -2.0536F, 0.3816F, -0.1078F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(0, 64).addBox(0.3942F, 5.4687F, 0.3894F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -2.2718F, 0.3816F, -0.1078F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(62, 6).addBox(-0.8595F, -2.2347F, 3.7056F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 2.5139F, 0.2086F, 0.057F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(69, 6).addBox(-0.8595F, -3.8863F, -1.9032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 1.0303F, 0.2086F, 0.057F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(49, 77).addBox(-0.8595F, -0.4898F, -3.11F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -0.4096F, 0.2086F, 0.057F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(5, 75).addBox(-1.0254F, 0.3809F, 0.2173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, -1.8461F, 0.1414F, 0.0764F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(85, 87).addBox(-0.9998F, -0.9167F, -0.2366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 2.3436F, 0.1212F, 0.0921F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(87, 46).addBox(-0.9998F, -1.063F, 0.5559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6F, 0.4034F, 0.3949F, 2.4745F, 0.1212F, 0.0921F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(40, 21).addBox(-0.5F, -0.4531F, 0.0037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, -0.1608F, -0.2154F, 0.0347F));

		PartDefinition cube_r417 = tail.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(8, 92).addBox(0.0F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 90).addBox(0.0F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 3.0037F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r418 = tail.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(85, 90).addBox(0.0F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4234F, 3.9065F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r419 = tail.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(5, 92).addBox(0.0F, 0.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4581F, 1.8452F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r420 = tail.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(80, 91).addBox(0.0F, -0.9544F, -0.9708F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 1.0037F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r421 = tail.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(15, 37).mirror().addBox(-1.5015F, 0.0F, -0.9651F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, -0.0239F, 0.0657F, -0.3521F));

		PartDefinition cube_r422 = tail.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(15, 37).addBox(-0.4985F, 0.0F, -0.9651F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, -0.0239F, -0.0657F, 0.3521F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(38, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4531F, 5.0037F, -0.0176F, -0.1309F, 0.0023F));

		PartDefinition cube_r423 = tail7.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(56, 91).addBox(0.0F, -0.7324F, -0.2891F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r424 = tail7.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(53, 91).addBox(0.0F, -0.9804F, 0.9608F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r425 = tail7.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(90, 83).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1607F, 3.6377F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail7.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(90, 79).addBox(0.0F, -0.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8418F, 0.9641F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 29).addBox(-0.5F, 0.0143F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(74, 91).addBox(0.0F, -0.4857F, 2.0362F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 91).addBox(0.0F, -0.3857F, 4.0362F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.9209F, 0.0727F, -0.2124F, -0.1008F));

		PartDefinition cube_r427 = tail2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(71, 91).addBox(0.0F, -1.3F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8143F, -0.0638F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r428 = tail2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(68, 91).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0822F, 4.804F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r429 = tail2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(65, 91).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2134F, 2.7686F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r430 = tail2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(62, 91).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4413F, 0.7591F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.4026F, -0.0453F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4143F, 6.0362F, 0.121F, 0.2708F, -0.0524F));

		PartDefinition cube_r431 = tail8.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(39, 45).addBox(0.0F, 1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 91).addBox(0.0F, 0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6678F, -1.2323F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(21, 7).addBox(-0.4968F, -0.9985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0033F, 0.606F, 4.7866F, 0.0135F, 0.2252F, 0.0459F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4968F, -0.6985F, -0.0349F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 7.0F, 0.1134F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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