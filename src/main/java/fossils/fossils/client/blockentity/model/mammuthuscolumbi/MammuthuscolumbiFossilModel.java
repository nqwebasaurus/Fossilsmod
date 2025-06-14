package fossils.fossils.client.blockentity.model.mammuthuscolumbi;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MammuthuscolumbiFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public MammuthuscolumbiFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone6 = this.hips.getChild("bone6");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.bone3 = this.head.getChild("bone3");
		this.bone4 = this.head.getChild("bone4");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -54.2247F, 16.607F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(152, 42).addBox(0.0F, -2.1125F, 0.0115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(121, 33).addBox(0.0F, -2.6885F, -0.0985F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -0.7F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 173).addBox(0.0F, -2.7063F, -0.0995F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -2.4F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(97, 146).mirror().addBox(-0.1197F, 0.4134F, -1.8197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5018F, -1.0117F, -1.2324F, -2.6552F, -0.5979F, 1.6015F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(97, 146).addBox(-0.8803F, 0.4134F, -1.8197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5018F, -1.0117F, -1.2324F, -2.6552F, 0.5979F, -1.6015F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(145, 23).addBox(-0.5F, -0.945F, -3.6521F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 18.6249F, 3.6016F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(128, 104).addBox(-0.5F, -0.898F, -5.1393F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 16.5151F, 0.7505F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(89, 14).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.7127F, -4.1499F, -1.4762F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 20).addBox(-5.318F, -0.1243F, -3.6187F, 8.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(5.1083F, 8.1278F, -1.5112F, -1.5702F, 0.4872F, -0.0864F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(159, 166).addBox(-0.847F, -0.2866F, 0.6914F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1083F, 8.1278F, -1.5112F, -0.9185F, 0.1147F, 0.7473F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 53).addBox(-6.4586F, -0.2866F, -0.9329F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.1083F, 8.1278F, -1.5112F, -1.0079F, 0.3667F, 0.3793F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(100, 114).addBox(-2.8684F, -0.21F, 0.2853F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7496F, 5.4982F, 0.5353F, -0.7442F, -0.1144F, 1.1682F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(81, 34).addBox(-2.5F, -0.5F, -1.6F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1539F, 2.7391F, -0.9689F, -1.9907F, 0.2547F, -0.9178F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(143, 111).addBox(-1.75F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8884F, 4.0353F, 3.4035F, -2.5073F, -0.8343F, -2.5475F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(128, 111).addBox(-3.075F, -0.95F, -0.65F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.8474F, 2.7259F, 3.3874F, -2.263F, -0.4388F, -2.1843F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(29, 148).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6509F, 0.012F, 1.3113F, -2.1869F, -0.162F, -1.7167F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 7).addBox(0.1482F, -0.1148F, -2.9414F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7496F, 5.4982F, 0.5353F, -2.0916F, -0.0108F, -1.4513F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(168, 57).addBox(0.2232F, -1.9398F, 2.6844F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.7425F, 17.0998F, 5.7367F, 0.702F, 1.1569F, 2.6342F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(145, 12).addBox(0.7125F, -1.9898F, 1.6393F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.1571F, 16.3708F, 6.6707F, 0.2918F, 0.4448F, 2.1039F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(159, 162).addBox(3.1474F, -2.1995F, -1.0611F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0815F, 14.8029F, 7.45F, 0.3029F, 0.1755F, 2.0967F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(49, 109).addBox(-1.4F, -0.5F, -3.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8609F, 16.7602F, 4.4221F, 0.5496F, 1.0505F, 2.6384F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(94, 164).addBox(1.9691F, -2.4991F, -1.1505F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0815F, 14.8029F, 7.45F, 0.2658F, 0.151F, 2.1908F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 26).addBox(-1.9924F, -0.0893F, -0.445F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2086F, 10.6911F, 3.5275F, -0.5366F, 0.7487F, -1.3328F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(143, 84).addBox(-2.3924F, -0.7893F, -0.445F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2086F, 10.6911F, 3.5275F, -0.7286F, 0.5663F, -1.644F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(141, 46).addBox(0.0F, -0.8F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9215F, 17.8042F, 5.1399F, -0.3618F, 0.2855F, -1.0371F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(140, 58).addBox(-3.1F, -1.4F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3408F, 15.2257F, 4.2329F, -0.4037F, 0.2202F, -1.2043F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(136, 126).addBox(-1.6037F, 2.489F, -1.939F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2983F, 14.2651F, 4.1926F, -2.3169F, 0.9701F, 3.034F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(163, 37).addBox(-0.1362F, -1.1142F, -3.1301F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.7127F, 20.665F, 2.2267F, -0.5066F, -0.9415F, -0.7058F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(123, 7).addBox(-0.3648F, -3.704F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9931F, 14.8327F, 1.7039F, -1.0993F, 0.4407F, 0.6379F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(47, 148).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.8215F, 15.8015F, 1.6297F, -0.2304F, 0.5023F, 0.8213F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-4.7127F, -4.1499F, -1.4762F));

		PartDefinition cube_r31 = bone6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-2.682F, -0.1243F, -3.6187F, 8.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-5.1083F, 8.1278F, -1.5112F, -1.5702F, -0.4872F, 0.0864F));

		PartDefinition cube_r32 = bone6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(159, 166).mirror().addBox(-3.153F, -0.2866F, 0.6914F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1083F, 8.1278F, -1.5112F, -0.9185F, -0.1147F, -0.7473F));

		PartDefinition cube_r33 = bone6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(77, 53).mirror().addBox(-2.5414F, -0.2866F, -0.9329F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.1083F, 8.1278F, -1.5112F, -1.0079F, -0.3667F, -0.3793F));

		PartDefinition cube_r34 = bone6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(100, 114).mirror().addBox(-3.1316F, -0.21F, 0.2853F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7496F, 5.4982F, 0.5353F, -0.7442F, 0.1144F, -1.1682F));

		PartDefinition cube_r35 = bone6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(-1.5F, -0.5F, -1.6F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1539F, 2.7391F, -0.9689F, -1.9907F, -0.2547F, 0.9178F));

		PartDefinition cube_r36 = bone6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(143, 111).mirror().addBox(-2.25F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8884F, 4.0353F, 3.4035F, -2.5073F, 0.8343F, 2.5475F));

		PartDefinition cube_r37 = bone6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(128, 111).mirror().addBox(-0.925F, -0.95F, -0.65F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.8474F, 2.7259F, 3.3874F, -2.263F, 0.4388F, 2.1843F));

		PartDefinition cube_r38 = bone6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 148).mirror().addBox(0.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6509F, 0.012F, 1.3113F, -2.1869F, 0.162F, 1.7167F));

		PartDefinition cube_r39 = bone6.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(83, 7).mirror().addBox(-5.1482F, -0.1148F, -2.9414F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7496F, 5.4982F, 0.5353F, -2.0916F, 0.0108F, 1.4513F));

		PartDefinition cube_r40 = bone6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(168, 57).mirror().addBox(-2.2232F, -1.9398F, 2.6844F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.7425F, 17.0998F, 5.7367F, 0.702F, -1.1569F, -2.6342F));

		PartDefinition cube_r41 = bone6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(145, 12).mirror().addBox(-5.7125F, -1.9898F, 1.6393F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.1571F, 16.3708F, 6.6707F, 0.2918F, -0.4448F, -2.1039F));

		PartDefinition cube_r42 = bone6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(159, 162).mirror().addBox(-6.1474F, -2.1995F, -1.0611F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0815F, 14.8029F, 7.45F, 0.3029F, -0.1755F, -2.0967F));

		PartDefinition cube_r43 = bone6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(49, 109).mirror().addBox(-0.6F, -0.5F, -3.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.8609F, 16.7602F, 4.4221F, 0.5496F, -1.0505F, -2.6384F));

		PartDefinition cube_r44 = bone6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(94, 164).mirror().addBox(-2.9691F, -2.4991F, -1.1505F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0815F, 14.8029F, 7.45F, 0.2658F, -0.151F, -2.1908F));

		PartDefinition cube_r45 = bone6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 26).mirror().addBox(-4.0076F, -0.0893F, -0.445F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, 10.6911F, 3.5275F, -0.5366F, -0.7487F, 1.3328F));

		PartDefinition cube_r46 = bone6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(143, 84).mirror().addBox(-2.6076F, -0.7893F, -0.445F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, 10.6911F, 3.5275F, -0.7286F, -0.5663F, 1.644F));

		PartDefinition cube_r47 = bone6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(141, 46).mirror().addBox(-6.0F, -0.8F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9215F, 17.8042F, 5.1399F, -0.3618F, -0.2855F, 1.0371F));

		PartDefinition cube_r48 = bone6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(140, 58).mirror().addBox(-2.9F, -1.4F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3408F, 15.2257F, 4.2329F, -0.4037F, -0.2202F, 1.2043F));

		PartDefinition cube_r49 = bone6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(136, 126).mirror().addBox(-3.3963F, 2.489F, -1.939F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.2983F, 14.2651F, 4.1926F, -2.3169F, -0.9701F, -3.034F));

		PartDefinition cube_r50 = bone6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(163, 37).mirror().addBox(-0.8638F, -1.1142F, -3.1301F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.7127F, 20.665F, 2.2267F, -0.5066F, 0.9415F, 0.7058F));

		PartDefinition cube_r51 = bone6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(123, 7).mirror().addBox(-0.6352F, -3.704F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.9931F, 14.8327F, 1.7039F, -1.0993F, -0.4407F, -0.6379F));

		PartDefinition cube_r52 = bone6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(47, 148).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.8215F, 15.8015F, 1.6297F, -0.2304F, -0.5023F, -0.8213F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7F, 12.2034F, 1.6645F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(63, 164).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 158).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7367F, -3.415F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 161).addBox(-1.0F, -1.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3259F, -3.3164F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(29, 144).addBox(0.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7885F, 3.5156F, 0.9257F, -0.2457F, 0.134F, 0.4896F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(103, 164).addBox(-1.7885F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7885F, 3.5156F, 0.9257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(105, 129).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.3792F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(118, 129).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(69, 59).addBox(-1.0F, -3.4F, -0.9F, 2.0F, 16.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -0.4575F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(18, 144).addBox(-1.0F, 2.5309F, 0.676F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 144).addBox(-1.5F, 2.3225F, 1.8198F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(151, 0).addBox(-1.5F, 0.9938F, 1.6101F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(152, 37).addBox(-1.5F, -0.2123F, 0.8913F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 117).addBox(-1.5F, 1.1302F, -0.0211F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(36, 153).addBox(-1.0F, -0.9167F, 0.9268F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(129, 151).addBox(-1.0F, -1.5628F, -0.5908F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 23.3105F, -1.3785F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(125, 33).addBox(-1.5F, -1.4F, -2.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7822F, 3.5147F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(125, 0).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(118, 169).addBox(0.0F, 13.6F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(131, 158).addBox(0.0F, 1.6F, 1.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 0.3972F, 2.01F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(34, 166).addBox(0.0F, -0.1F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.9F, 9.0494F, 0.831F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(9, 139).addBox(-1.0F, -3.0F, -1.2F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8336F, 1.2495F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 169).addBox(-2.4F, -1.835F, -1.0436F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 15.1912F, -2.9572F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(167, 109).addBox(-2.4F, -1.935F, -1.0686F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 15.9285F, -2.2816F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(130, 98).addBox(-2.4F, 0.765F, -0.1686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(69, 117).addBox(-1.9F, -11.735F, 0.1314F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(132, 23).addBox(-2.4F, 2.39F, -1.9686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(160, 29).addBox(-1.9F, -0.035F, -1.8686F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9F, 10.7321F, 0.281F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(97, 149).addBox(-1.9F, -1.035F, -1.6686F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 10.7321F, 0.281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(123, 16).addBox(-1.5F, -0.4444F, -1.1179F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.122F, -2.2511F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(48, 126).addBox(-0.4F, -3.5205F, -1.1768F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 0.8414F, 1.1936F, -0.5847F, -0.2182F, 0.0F));

		PartDefinition cube_r79 = leftLeg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 173).addBox(-1.0F, 0.1F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(87, 137).addBox(-1.0F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(119, 116).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.5036F, -1.6985F, 2.5963F, 0.3018F, -0.2129F, -0.0479F));

		PartDefinition cube_r80 = leftLeg3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 164).addBox(-0.5F, -0.6398F, -1.3734F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.2F, 0.6414F, 1.7936F, 0.0349F, -0.2182F, 0.0F));

		PartDefinition cube_r81 = leftLeg3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(22, 120).addBox(-0.4F, -2.7398F, -0.7734F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.2F, 0.8414F, 1.1936F, -0.8378F, -0.2182F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(133, 145).addBox(-1.0F, -1.0696F, -1.9933F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8771F, -0.1986F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(153, 115).addBox(-1.7556F, 0.1612F, -0.9345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1745F, 0.2618F, -0.5672F));

		PartDefinition cube_r83 = leftLeg4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(153, 61).addBox(-0.5017F, 0.3224F, -0.9339F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1309F, -0.1309F, 0.5672F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.4006F, -2.1417F, -1.0051F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(141, 162).addBox(-2.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.2782F, -1.685F, -0.4461F, 0.4802F, -0.2174F));

		PartDefinition cube_r85 = leftLeg5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(106, 0).addBox(-2.5023F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.1F, -2.3F, -0.3957F, -0.1209F, 0.0503F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7F, 12.2034F, 1.6645F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(72, 164).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(85, 159).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7367F, -3.415F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(162, 126).addBox(-1.0F, -1.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3259F, -3.3164F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 173).addBox(-1.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7885F, 3.5156F, 0.9257F, -0.2457F, -0.134F, -0.4896F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(164, 132).addBox(-1.2115F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7885F, 3.5156F, 0.9257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(131, 66).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.3792F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(95, 131).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(17, 70).addBox(-1.0F, -3.4F, -0.9F, 2.0F, 16.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -0.4575F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(144, 66).addBox(-1.0F, 2.5309F, 0.676F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(44, 167).addBox(-1.5F, 2.3225F, 1.8198F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(25, 152).addBox(-1.5F, 0.9938F, 1.6101F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(65, 152).addBox(-1.5F, -0.2123F, 0.8913F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(117, 96).addBox(-1.5F, 1.1302F, -0.0211F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(156, 22).addBox(-1.0F, -0.9167F, 0.9268F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(151, 138).addBox(-1.0F, -1.5628F, -0.5908F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.9652F, -1.2822F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 23.3105F, -1.3785F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(56, 125).addBox(-1.5F, -1.4F, -2.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7822F, 3.5147F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(22, 125).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(169, 120).addBox(-1.0F, 13.6F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(136, 164).addBox(-1.0F, 1.6F, 1.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9F, 0.3972F, 2.01F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(39, 166).addBox(-1.0F, -0.1F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.9F, 9.0494F, 0.831F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(35, 139).addBox(-1.0F, -3.0F, -1.2F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8336F, 1.2495F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 169).addBox(-0.6F, -1.835F, -1.0436F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 15.1912F, -2.9572F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(150, 167).addBox(-0.6F, -1.935F, -1.0686F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 15.9285F, -2.2816F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(22, 132).addBox(-0.6F, 0.765F, -0.1686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(96, 119).addBox(-0.1F, -11.735F, 0.1314F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(48, 132).addBox(-0.6F, 2.39F, -1.9686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(36, 160).addBox(-0.1F, -0.035F, -1.8686F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9F, 10.7321F, 0.281F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(106, 149).addBox(-0.1F, -1.035F, -1.6686F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 10.7321F, 0.281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(78, 123).addBox(-1.5F, -0.4444F, -1.1179F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.122F, -2.2511F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 167).addBox(-1.6F, -3.5205F, -1.1768F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 0.8414F, 1.1936F, -0.5847F, 0.2182F, 0.0F));

		PartDefinition cube_r112 = rightLeg3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(44, 173).addBox(-1.0F, 0.1F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(173, 34).addBox(-1.0F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(173, 0).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-0.5036F, -1.6985F, 2.5963F, 0.3018F, 0.2129F, 0.0479F));

		PartDefinition cube_r113 = rightLeg3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(164, 61).addBox(-1.5F, -0.6398F, -1.3734F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.2F, 0.6414F, 1.7936F, 0.0349F, 0.2182F, 0.0F));

		PartDefinition cube_r114 = rightLeg3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(61, 132).addBox(-1.6F, -2.7398F, -0.7734F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.2F, 0.8414F, 1.1936F, -0.8378F, 0.2182F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 148).addBox(-1.0F, -1.0696F, -1.9933F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8771F, -0.1986F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(154, 88).addBox(-0.2444F, 0.1612F, -0.9345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1745F, -0.2618F, 0.5672F));

		PartDefinition cube_r116 = rightLeg4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(153, 133).addBox(-1.4983F, 0.3224F, -0.9339F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1309F, 0.1309F, -0.5672F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.4006F, -2.1417F, -0.2634F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(163, 71).addBox(1.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.2782F, -1.685F, -0.4461F, -0.4802F, 0.2174F));

		PartDefinition cube_r118 = rightLeg5.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(100, 107).addBox(-2.4977F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -2.3F, -0.3957F, 0.1209F, -0.0503F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.6F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(173, 148).addBox(0.0F, -3.2798F, -0.0429F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6064F, -0.859F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(104, 174).addBox(0.0F, -3.0545F, -0.0038F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.331F, -2.7389F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(137, 173).addBox(0.0F, -3.4398F, -0.0023F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.531F, -4.7389F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(174, 76).addBox(0.0F, -3.5115F, -0.0418F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.031F, -6.6389F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(134, 173).addBox(0.0F, -3.5402F, 0.0197F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5315F, -8.7301F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(161, 109).mirror().addBox(-6.1584F, -2.1036F, -0.0993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.9931F, -6.9075F, -0.4158F, 0.0984F, -1.7434F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(171, 14).mirror().addBox(-5.5702F, 0.0792F, -0.0993F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.9931F, -6.9075F, -0.3493F, 0.2501F, -1.3656F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(12, 174).mirror().addBox(-2.4622F, 0.7417F, -0.0993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.9931F, -6.9075F, -0.2744F, 0.3309F, -1.1055F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(170, 107).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4931F, -8.5075F, -0.2744F, 0.3309F, -1.0532F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(170, 105).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4931F, -8.5075F, -0.3493F, 0.2501F, -1.3132F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(170, 99).mirror().addBox(-7.9505F, -3.2692F, -0.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4931F, -8.5075F, -0.4158F, 0.0984F, -1.7434F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(174, 22).mirror().addBox(-1.9001F, -0.0189F, -0.6381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6F, -4.3F, -0.1932F, -0.172F, -0.4025F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(44, 171).mirror().addBox(-2.0116F, 0.0186F, -0.2655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3F, -2.7F, -0.1761F, -0.3083F, -0.4224F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(170, 103).mirror().addBox(-2.8145F, 0.0281F, -0.717F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.3F, -0.1413F, -0.4337F, -0.4044F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(174, 22).addBox(-0.0999F, -0.0189F, -0.6381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6F, -4.3F, -0.1932F, 0.172F, 0.4025F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(12, 174).addBox(0.4622F, 0.7417F, -0.0993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.9931F, -6.9075F, -0.2744F, -0.3309F, 1.1055F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(171, 14).addBox(2.5702F, 0.0792F, -0.0993F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.9931F, -6.9075F, -0.3493F, -0.2501F, 1.3656F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(161, 109).addBox(5.1584F, -2.1036F, -0.0993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.9931F, -6.9075F, -0.4158F, -0.0984F, 1.7434F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(170, 99).addBox(4.9505F, -3.2692F, -0.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4931F, -8.5075F, -0.4158F, -0.0984F, 1.7434F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(170, 105).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4931F, -8.5075F, -0.3493F, -0.2501F, 1.3132F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(170, 107).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4931F, -8.5075F, -0.2744F, -0.3309F, 1.0532F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(44, 171).addBox(-0.9884F, 0.0186F, -0.2655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.7F, -0.1761F, 0.3083F, 0.4224F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(170, 103).addBox(-0.1855F, 0.0281F, -0.717F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.3F, -0.1413F, 0.4337F, 0.4044F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -0.1512F, 3.7474F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -13.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8975F, -9.5687F, -0.2144F, -0.2133F, 0.0461F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(170, 93).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.2556F, 0.3653F, -0.5497F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(160, 55).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.3409F, 0.2879F, -0.8139F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(136, 21).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.4223F, 0.1365F, -1.1947F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(136, 132).mirror().addBox(-18.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.4424F, -0.011F, -1.512F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(125, 40).mirror().addBox(-12.8305F, -8.3882F, -0.4098F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.4394F, 0.0413F, -1.6167F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(136, 19).mirror().addBox(-13.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.4028F, 0.1852F, -1.2963F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(160, 35).mirror().addBox(-7.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.303F, 0.3258F, -0.9071F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-3.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.2073F, 0.3923F, -0.6365F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(12, 170).mirror().addBox(-3.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.2073F, 0.3923F, -0.5841F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(158, 101).mirror().addBox(-7.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.303F, 0.3258F, -0.8548F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(136, 17).mirror().addBox(-13.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.4028F, 0.1852F, -1.2439F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(169, 142).mirror().addBox(-14.8305F, -8.3882F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.4394F, 0.0413F, -1.5643F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(169, 53).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.2396F, 0.3744F, -0.5439F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(158, 12).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.3284F, 0.3006F, -0.8102F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(136, 15).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.4158F, 0.1528F, -1.1938F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(136, 130).mirror().addBox(-18.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.4414F, 0.0065F, -1.512F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(89, 24).mirror().addBox(-16.8305F, -8.3882F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.4404F, 0.0239F, -1.512F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(171, 18).mirror().addBox(0.8811F, -0.9803F, -0.4278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 8.1361F, 4.1161F, -1.6367F, -0.1182F, -1.1668F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(170, 156).mirror().addBox(-0.2933F, -0.0797F, -0.5506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5805F, 9.2483F, 3.4703F, -1.634F, -0.6483F, -1.0849F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(113, 161).mirror().addBox(-2.2031F, -0.0785F, -0.6073F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5805F, 9.2483F, 3.4703F, -1.6895F, -0.8182F, -1.0052F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(12, 172).mirror().addBox(-1.6F, -0.225F, -0.65F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8875F, 11.1333F, 0.7885F, -1.7114F, -0.8508F, -0.8546F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(171, 101).mirror().addBox(-1.8F, -0.525F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8498F, 12.743F, -1.5246F, -1.8317F, -0.6492F, -0.7337F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(171, 16).mirror().addBox(-5.8853F, -0.3757F, -3.4216F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9961F, 12.509F, -0.2497F, -1.5619F, -0.7772F, -1.1705F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(171, 12).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1044F, -0.5388F, -0.1866F, 0.4445F, -0.8279F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(170, 166).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1044F, -0.5388F, -0.2986F, 0.3812F, -1.1054F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(161, 81).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1044F, -0.5388F, -0.4205F, 0.238F, -1.4999F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(170, 164).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3044F, -2.5388F, -0.1866F, 0.4445F, -0.7756F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(170, 162).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3044F, -2.5388F, -0.2986F, 0.3812F, -1.0531F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(143, 102).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3044F, -2.5388F, -0.4205F, 0.238F, -1.4475F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(107, 76).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6044F, -4.5388F, -0.4193F, 0.2031F, -1.3425F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(170, 160).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6044F, -4.5388F, -0.3117F, 0.3485F, -0.953F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(170, 158).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6044F, -4.5388F, -0.2094F, 0.4164F, -0.6803F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(134, 49).mirror().addBox(-13.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.4093F, 0.169F, -1.1927F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(156, 86).mirror().addBox(-7.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.3157F, 0.3132F, -0.8064F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(167, 113).mirror().addBox(-3.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.2235F, 0.3834F, -0.5379F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(161, 81).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1044F, -0.5388F, -0.4205F, -0.238F, 1.4999F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(170, 166).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1044F, -0.5388F, -0.2986F, -0.3812F, 1.1054F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(171, 12).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1044F, -0.5388F, -0.1866F, -0.4445F, 0.8279F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(143, 102).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3044F, -2.5388F, -0.4205F, -0.238F, 1.4475F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(170, 162).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3044F, -2.5388F, -0.2986F, -0.3812F, 1.0531F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(170, 164).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3044F, -2.5388F, -0.1866F, -0.4445F, 0.7756F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(171, 18).addBox(-3.8811F, -0.9803F, -0.4278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.094F, 8.1361F, 4.1161F, -1.6367F, 0.1182F, 1.1668F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(170, 156).addBox(-2.7067F, -0.0797F, -0.5506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5805F, 9.2483F, 3.4703F, -1.634F, 0.6483F, 1.0849F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(113, 161).addBox(0.2031F, -0.0785F, -0.6073F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5805F, 9.2483F, 3.4703F, -1.6895F, 0.8182F, 1.0052F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(12, 172).addBox(-1.4F, -0.225F, -0.65F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8875F, 11.1333F, 0.7885F, -1.7114F, 0.8508F, 0.8546F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(171, 101).addBox(-1.2F, -0.525F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8498F, 12.743F, -1.5246F, -1.8317F, 0.6492F, 0.7337F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(107, 76).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6044F, -4.5388F, -0.4193F, -0.2031F, 1.3425F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(170, 160).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6044F, -4.5388F, -0.3117F, -0.3485F, 0.953F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(170, 158).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6044F, -4.5388F, -0.2094F, -0.4164F, 0.6803F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(171, 16).addBox(2.8853F, -0.3757F, -3.4216F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9961F, 12.509F, -0.2497F, -1.5619F, 0.7772F, 1.1705F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -14.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2249F, -0.9744F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(107, 174).addBox(0.0F, -4.4539F, -0.113F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.035F, -1.4981F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(173, 168).addBox(0.0F, -3.9496F, -0.11F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.565F, -2.8981F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(12, 160).addBox(0.0F, -1.7521F, 0.0413F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.535F, -14.8981F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(31, 168).addBox(-0.005F, -6.9731F, 0.0843F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.065F, -14.5981F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(80, 172).addBox(-0.005F, -4.7881F, -0.1709F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.19F, -4.8231F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(128, 169).addBox(-0.005F, -5.4577F, -0.1217F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.19F, -6.8231F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(148, 171).addBox(-0.005F, -6.009F, -0.0539F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.49F, -8.8231F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(126, 75).addBox(0.0F, -1.6821F, -0.146F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.01F, -9.0231F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(151, 171).addBox(-0.005F, -6.009F, -0.0539F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.99F, -10.7231F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(141, 151).addBox(0.0F, -1.6821F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.51F, -10.9231F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(96, 115).addBox(0.0F, -1.682F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.735F, -12.9481F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(136, 132).addBox(11.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.4424F, 0.011F, 1.512F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(136, 21).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.4223F, -0.1365F, 1.1947F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(160, 55).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.3409F, -0.2879F, 0.8139F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(170, 93).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.2556F, -0.3653F, 0.5497F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(136, 130).addBox(11.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.4414F, -0.0065F, 1.512F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(136, 15).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.4158F, -0.1528F, 1.1938F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(158, 12).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.3284F, -0.3006F, 0.8102F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(169, 53).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.2396F, -0.3744F, 0.5439F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(80, 170).addBox(0.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.2073F, -0.3923F, 0.6365F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(160, 35).addBox(2.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.303F, -0.3258F, 0.9071F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(136, 19).addBox(6.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.4028F, -0.1852F, 1.2963F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(125, 40).addBox(11.8305F, -8.3882F, -0.4098F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.4394F, -0.0413F, 1.6167F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(169, 142).addBox(11.8305F, -8.3882F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.4394F, -0.0413F, 1.5643F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(136, 17).addBox(6.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.4028F, -0.1852F, 1.2439F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(158, 101).addBox(2.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.303F, -0.3258F, 0.8548F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(12, 170).addBox(0.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.2073F, -0.3923F, 0.5841F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(89, 24).addBox(11.8305F, -8.3882F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.4404F, -0.0239F, 1.512F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(134, 49).addBox(6.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.4093F, -0.169F, 1.1927F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(156, 86).addBox(2.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.3157F, -0.3132F, 0.8064F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(167, 113).addBox(0.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.2235F, -0.3834F, 0.5379F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(131, 167).addBox(-0.005F, -7.009F, -0.0539F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.765F, -12.7481F, -0.5585F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2203F, -14.9253F, -0.0089F, -0.1745F, 0.0015F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(44, 139).addBox(0.0F, -11.8331F, -0.2365F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7101F, -9.3238F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(60, 7).addBox(-0.005F, -12.6763F, -0.816F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6101F, -7.4988F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(125, 169).addBox(0.0F, -5.8331F, -0.2365F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6101F, -7.4988F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(25, 47).addBox(-0.005F, -11.6763F, -0.516F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7101F, -5.5238F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(18, 139).addBox(0.0F, -2.8331F, -0.2365F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7101F, -5.5238F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(21, 165).addBox(-0.005F, -10.9496F, -0.4709F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1601F, -3.6988F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(173, 174).addBox(0.0F, -2.1057F, -0.2676F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1601F, -3.6988F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(9, 122).addBox(-0.005F, -6.9879F, -0.1076F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4899F, -1.1238F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(57, 138).addBox(0.0F, -3.0603F, -0.2762F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4101F, -1.8238F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(155, 59).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6841F, -8.8135F, -0.3902F, 0.2369F, -0.9837F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(132, 31).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6841F, -8.8135F, -0.448F, 0.0716F, -1.3545F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(164, 154).mirror().addBox(-14.835F, -8.3453F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6841F, -8.8135F, -0.4466F, -0.0807F, -1.6689F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(161, 99).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6841F, -8.8135F, -0.3185F, 0.3282F, -0.7281F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(156, 84).mirror().addBox(-16.835F, -8.3453F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.4466F, -0.0807F, -1.5991F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(132, 29).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.448F, 0.0716F, -1.2847F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(155, 57).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.3902F, 0.2369F, -0.9139F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(117, 139).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.3185F, 0.3282F, -0.6583F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(87, 42).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.3029F, 0.3376F, -0.6009F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(102, 56).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.378F, 0.2497F, -0.8586F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(131, 73).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.4416F, 0.0878F, -1.2318F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(102, 96).mirror().addBox(-17.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.4455F, -0.0632F, -1.5468F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(170, 97).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.3029F, 0.3376F, -0.5659F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(161, 79).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.378F, 0.2497F, -0.8237F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(136, 118).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.4416F, 0.0878F, -1.1969F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(136, 136).mirror().addBox(-18.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.4455F, -0.0632F, -1.5119F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(170, 95).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.2715F, 0.3562F, -0.5553F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(161, 77).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.3534F, 0.2752F, -0.8173F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(136, 116).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.4288F, 0.1203F, -1.1955F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(136, 134).mirror().addBox(-18.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.4435F, -0.0284F, -1.512F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(58, 42).mirror().addBox(-14.1232F, 1.0761F, -0.5309F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 21.8735F, 1.4191F, 0.9191F, 0.6444F, 0.8061F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(110, 174).mirror().addBox(-1.5551F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 21.8735F, 1.4191F, 0.0509F, 1.0638F, -0.2768F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(174, 90).mirror().addBox(-1.5551F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 21.8735F, 1.0191F, -0.037F, 0.835F, -0.3525F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(80, 76).mirror().addBox(-13.1232F, 1.0761F, -0.5309F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 21.8735F, 1.0191F, 0.6469F, 0.5725F, 0.646F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-9.7823F, -0.1031F, -0.3607F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 21.6735F, 0.6191F, 0.1281F, 0.343F, 0.3298F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(102, 38).mirror().addBox(-9.3058F, -0.0027F, -0.4198F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 21.6735F, -0.3809F, 0.0945F, 0.2287F, 0.2444F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(174, 88).mirror().addBox(-1.5551F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 21.7735F, 0.9191F, -0.1307F, 0.5712F, -0.4118F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(102, 52).mirror().addBox(-11.1232F, 1.0761F, -0.5309F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 21.7735F, 0.9191F, 0.3504F, 0.4778F, 0.4981F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(37, 30).mirror().addBox(-8.8551F, -0.0333F, -0.5309F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 21.3735F, -2.3809F, 0.0707F, 0.2183F, 0.1539F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(102, 54).mirror().addBox(-7.9551F, -0.0333F, -0.5309F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 21.3735F, -4.3809F, 0.0406F, 0.2444F, 0.1513F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(115, 50).mirror().addBox(-7.5854F, 0.1085F, -0.8004F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 21.3735F, -6.8809F, 0.06F, 0.3387F, 0.1921F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(110, 174).addBox(-0.4449F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 21.8735F, 1.4191F, 0.0509F, -1.0638F, 0.2768F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(58, 42).addBox(1.1232F, 1.0761F, -0.5309F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 21.8735F, 1.4191F, 0.9191F, -0.6444F, -0.8061F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 76).addBox(1.1232F, 1.0761F, -0.5309F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 21.8735F, 1.0191F, 0.6469F, -0.5725F, -0.646F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(174, 90).addBox(-0.4449F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 21.8735F, 1.0191F, -0.037F, -0.835F, 0.3525F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(174, 88).addBox(-0.4449F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 21.7735F, 0.9191F, -0.1307F, -0.5712F, 0.4118F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(102, 52).addBox(1.1232F, 1.0761F, -0.5309F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 21.7735F, 0.9191F, 0.3504F, -0.4778F, -0.4981F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(102, 40).addBox(-0.2177F, -0.1031F, -0.3607F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 21.6735F, 0.6191F, 0.1281F, -0.343F, -0.3298F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(102, 38).addBox(-0.6942F, -0.0027F, -0.4198F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 21.6735F, -0.3809F, 0.0945F, -0.2287F, -0.2444F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(37, 30).addBox(-0.1449F, -0.0333F, -0.5309F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 21.3735F, -2.3809F, 0.0707F, -0.2183F, -0.1539F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(102, 54).addBox(-1.0449F, -0.0333F, -0.5309F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 21.3735F, -4.3809F, 0.0406F, -0.2444F, -0.1513F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(161, 99).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6841F, -8.8135F, -0.3185F, -0.3282F, 0.7281F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(164, 154).addBox(11.835F, -8.3453F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6841F, -8.8135F, -0.4466F, 0.0807F, 1.6689F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(132, 31).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6841F, -8.8135F, -0.448F, -0.0716F, 1.3545F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(155, 59).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6841F, -8.8135F, -0.3902F, -0.2369F, 0.9837F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(117, 139).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.3185F, -0.3282F, 0.6583F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(155, 57).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.3902F, -0.2369F, 0.9139F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(132, 29).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.448F, -0.0716F, 1.2847F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(156, 84).addBox(11.835F, -8.3453F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.4466F, 0.0807F, 1.5991F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(102, 96).addBox(11.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.4455F, 0.0632F, 1.5468F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(131, 73).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.4416F, -0.0878F, 1.2318F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(102, 56).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.378F, -0.2497F, 0.8586F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(87, 42).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.3029F, -0.3376F, 0.6009F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(136, 136).addBox(11.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.4455F, 0.0632F, 1.5119F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(136, 118).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.4416F, -0.0878F, 1.1969F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(161, 79).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.378F, -0.2497F, 0.8237F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(170, 97).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.3029F, -0.3376F, 0.5659F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(136, 134).addBox(11.835F, -8.3453F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.4435F, 0.0284F, 1.512F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(136, 116).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.4288F, -0.1203F, 1.1955F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(161, 77).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.3534F, -0.2752F, 0.8173F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(170, 95).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.2715F, -0.3562F, 0.5553F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(115, 50).addBox(-0.4146F, 0.1085F, -0.8004F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 21.3735F, -6.8809F, 0.06F, -0.3387F, -0.1921F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(25, 59).addBox(-1.0F, -0.7839F, 0.0248F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 21.5821F, -7.4872F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(77, 44).addBox(-1.5F, -0.2802F, -0.1543F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.9821F, -13.1872F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(37, 16).addBox(-1.0F, -1.908F, 2.84F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.9F, -12.5F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.299F, 10.3808F, -11.1437F, 0.3487F, 0.1875F, -0.2066F));

		PartDefinition cube_r300 = leftarm.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(150, 156).addBox(-1.5F, 0.0201F, -0.4278F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 18.7766F, 8.0038F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftarm.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(141, 39).addBox(-1.5F, -2.5096F, -1.4643F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 18.7766F, 8.0038F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftarm.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(140, 174).addBox(0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5891F, -0.9255F, 3.0999F, -0.1048F, 0.0014F, -0.001F));

		PartDefinition cube_r303 = leftarm.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(161, 93).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.5857F, -2.1012F, 0.5819F, -0.2364F, 0.0124F, 0.0026F));

		PartDefinition cube_r304 = leftarm.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(140, 138).addBox(0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5848F, -1.655F, -0.3131F, -1.1084F, 0.0014F, -0.001F));

		PartDefinition cube_r305 = leftarm.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(164, 149).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5894F, -0.3069F, 2.9069F, -0.1334F, 0.113F, 0.6897F));

		PartDefinition cube_r306 = leftarm.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(65, 157).addBox(-1.0F, -2.1F, 0.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5894F, 1.0477F, 1.9555F, -0.0001F, 0.0014F, -0.001F));

		PartDefinition cube_r307 = leftarm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(66, 90).addBox(0.5F, -0.9F, -4.7F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5902F, 4.1054F, 0.8303F, -0.9775F, 0.0014F, -0.001F));

		PartDefinition cube_r308 = leftarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(153, 126).addBox(-0.5F, -0.375F, -2.075F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5879F, 0.4327F, 0.4516F, -0.824F, -0.0627F, -0.0248F));

		PartDefinition cube_r309 = leftarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(68, 143).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.5894F, 3.7945F, 0.1024F, -0.3492F, 0.0014F, -0.001F));

		PartDefinition cube_r310 = leftarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 134).addBox(-1.0F, -6.9475F, 0.0581F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.6002F, 10.997F, 3.1957F, 0.4362F, 0.0014F, -0.001F));

		PartDefinition cube_r311 = leftarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(127, 116).addBox(-1.0F, -9.0642F, 0.6678F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 18.7766F, 8.0038F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(16, 150).addBox(-1.0F, -5.3925F, -1.7122F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 18.7766F, 8.0038F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(105, 119).addBox(-1.0F, -1.5F, -1.1F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 1.6422F, 2.125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(121, 78).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 5.401F, 3.493F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7602F, 20.8336F, 7.4702F, -0.9042F, 0.0801F, 0.1058F));

		PartDefinition cube_r315 = leftarm2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(169, 137).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1501F, 0.8493F, -1.18F, 1.5001F, -1.2163F, -1.4785F));

		PartDefinition cube_r316 = leftarm2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(120, 150).addBox(-0.25F, -3.5F, -2.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0672F, 12.5776F, 0.3219F, -1.3992F, -1.5352F, 1.4172F));

		PartDefinition cube_r317 = leftarm2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(77, 143).addBox(-1.2F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4457F, 13.891F, 0.4499F, -1.6744F, -1.4385F, 1.6901F));

		PartDefinition cube_r318 = leftarm2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(11, 148).addBox(-0.448F, -0.8088F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1118F, 2.0963F, -0.961F, 1.85F, -1.4399F, -1.6581F));

		PartDefinition cube_r319 = leftarm2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(12, 165).addBox(-0.6F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0122F, 14.6602F, 0.6927F, -1.5708F, -1.3526F, 1.5708F));

		PartDefinition cube_r320 = leftarm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(165, 42).addBox(0.0608F, 4.8093F, -1.2886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, 8.8057F, 0.0963F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r321 = leftarm2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(156, 111).addBox(-0.1F, 1.0F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, -1.5081F, 0.1246F, -1.5708F, -0.4014F, 1.5708F));

		PartDefinition cube_r322 = leftarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(119, 104).addBox(-0.5256F, -0.0299F, -1.3596F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.236F, 1.5425F, -0.1906F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r323 = leftarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(149, 120).addBox(-2.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2236F, 0.3885F, 1.2089F, 1.5708F, -1.3614F, -1.5708F));

		PartDefinition cube_r324 = leftarm2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(120, 158).addBox(-1.375F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2236F, -1.4836F, 2.8962F, 1.5708F, -0.829F, -1.5708F));

		PartDefinition cube_r325 = leftarm2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(165, 88).addBox(-0.2F, -2.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -0.5988F, 3.5671F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r326 = leftarm2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(113, 163).addBox(-0.8F, -1.25F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, -1.0818F, 3.7305F, -1.5708F, -0.9163F, 1.5708F));

		PartDefinition cube_r327 = leftarm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(161, 103).addBox(-0.1F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2236F, 2.3653F, 0.7011F, -1.5708F, -1.0472F, 1.5708F));

		PartDefinition cube_r328 = leftarm2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(104, 157).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, 8.4042F, 1.2858F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r329 = leftarm2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 154).addBox(-0.1F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 6.3599F, 0.4917F, -1.5708F, -1.5184F, 1.5708F));

		PartDefinition cube_r330 = leftarm2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(151, 49).addBox(-1.1F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0122F, 11.9807F, 2.4143F, 1.5708F, -1.2217F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3688F, 15.4626F, 0.8819F, 1.1671F, -0.0972F, 0.0079F));

		PartDefinition cube_r331 = leftArm3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(138, 0).addBox(-2.5002F, 0.0182F, -0.491F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.2177F, -0.0096F, -0.0084F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(122, 144).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 2.8459F, -0.09F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r332 = leftArm4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(90, 169).addBox(-1.5997F, -1.0456F, 0.5234F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9423F, 0.5743F, -1.0437F, 0.0735F, 0.8158F, 0.1714F));

		PartDefinition cube_r333 = leftArm4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(7, 171).addBox(-0.7053F, -4.4031F, -0.3039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2368F, 4.2008F, 0.0357F, -0.0322F, -0.8321F, -0.01F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1868F, 4.1664F, 1.226F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r334 = leftArm5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(165, 9).addBox(-2.3137F, -0.0065F, -0.1801F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.6F, -3.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r335 = leftArm5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(155, 66).addBox(-1.6565F, 2.6681F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.129F, -4.8649F, -1.4055F, 0.9497F, 0.8301F, 0.1502F));

		PartDefinition cube_r336 = leftArm5.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(138, 33).addBox(-1.665F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0501F, -1.2383F, -0.3261F, 1.0314F, -0.7945F, -0.0728F));

		PartDefinition cube_r337 = leftArm5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(81, 108).addBox(-2.3124F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.4F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.299F, 10.3808F, -11.1437F, -0.2892F, -0.0193F, 0.1295F));

		PartDefinition cube_r338 = rightarm.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(25, 157).addBox(-1.5F, 0.0201F, -0.4278F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 18.7766F, 8.0038F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightarm.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(57, 143).addBox(-1.5F, -2.5096F, -1.4643F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 18.7766F, 8.0038F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightarm.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(159, 174).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5891F, -0.9255F, 3.0999F, -0.1048F, -0.0014F, 0.001F));

		PartDefinition cube_r341 = rightarm.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(162, 14).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-1.5857F, -2.1012F, 0.5819F, -0.2364F, -0.0124F, -0.0026F));

		PartDefinition cube_r342 = rightarm.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(111, 142).addBox(-1.5F, -1.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5848F, -1.655F, -0.3131F, -1.1084F, -0.0014F, 0.001F));

		PartDefinition cube_r343 = rightarm.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(165, 4).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5894F, -0.3069F, 2.9069F, -0.1334F, -0.113F, -0.6897F));

		PartDefinition cube_r344 = rightarm.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(95, 157).addBox(-1.0F, -2.1F, 0.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5894F, 1.0477F, 1.9555F, -0.0001F, -0.0014F, 0.001F));

		PartDefinition cube_r345 = rightarm.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(83, 98).addBox(-1.5F, -0.9F, -4.7F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5902F, 4.1054F, 0.8303F, -0.9775F, -0.0014F, 0.001F));

		PartDefinition cube_r346 = rightarm.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(155, 149).addBox(-0.5F, -0.375F, -2.075F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5879F, 0.4327F, 0.4516F, -0.824F, 0.0627F, 0.0248F));

		PartDefinition cube_r347 = rightarm.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(143, 75).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-1.5894F, 3.7945F, 0.1024F, -0.3492F, -0.0014F, 0.001F));

		PartDefinition cube_r348 = rightarm.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(48, 138).addBox(-1.0F, -6.9475F, 0.0581F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-1.6002F, 10.997F, 3.1957F, 0.4362F, -0.0014F, 0.001F));

		PartDefinition cube_r349 = rightarm.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(127, 127).addBox(-1.0F, -9.0642F, 0.6678F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 18.7766F, 8.0038F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightarm.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(56, 150).addBox(-1.0F, -5.3925F, -1.7122F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 18.7766F, 8.0038F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightarm.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(116, 119).addBox(-1.0F, -1.5F, -1.1F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 1.6422F, 2.125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightarm.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 122).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 5.401F, 3.493F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7602F, 20.8336F, 7.4702F, -0.0752F, -0.0801F, -0.1058F));

		PartDefinition cube_r353 = rightarm2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(159, 169).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1501F, 0.8493F, -1.18F, 1.5001F, 1.2163F, 1.4785F));

		PartDefinition cube_r354 = rightarm2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(151, 29).addBox(-1.75F, -3.5F, -2.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0672F, 12.5776F, 0.3219F, -1.3992F, 1.5352F, -1.4172F));

		PartDefinition cube_r355 = rightarm2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(143, 94).addBox(-0.8F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4457F, 13.891F, 0.4499F, -1.6744F, 1.4385F, -1.6901F));

		PartDefinition cube_r356 = rightarm2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(115, 149).addBox(-0.552F, -0.8088F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1118F, 2.0963F, -0.961F, 1.85F, 1.4399F, 1.6581F));

		PartDefinition cube_r357 = rightarm2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(165, 20).addBox(-1.4F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0122F, 14.6602F, 0.6927F, -1.5708F, 1.3526F, -1.5708F));

		PartDefinition cube_r358 = rightarm2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(81, 165).addBox(-2.0608F, 4.8093F, -1.2886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, 8.8057F, 0.0963F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r359 = rightarm2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(157, 145).addBox(-2.9F, 1.0F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, -1.5081F, 0.1246F, -1.5708F, 0.4014F, -1.5708F));

		PartDefinition cube_r360 = rightarm2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(13, 120).addBox(-1.4744F, -0.0299F, -1.3596F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.236F, 1.5425F, -0.1906F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r361 = rightarm2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(144, 149).addBox(-1.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2236F, 0.3885F, 1.2089F, 1.5708F, 1.3614F, 1.5708F));

		PartDefinition cube_r362 = rightarm2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(74, 159).addBox(-1.625F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2236F, -1.4836F, 2.8962F, 1.5708F, 0.829F, 1.5708F));

		PartDefinition cube_r363 = rightarm2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(166, 66).addBox(-1.8F, -2.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, -0.5988F, 3.5671F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition cube_r364 = rightarm2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(122, 163).addBox(-1.2F, -1.25F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, -1.0818F, 3.7305F, -1.5708F, 0.9163F, -1.5708F));

		PartDefinition cube_r365 = rightarm2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(25, 162).addBox(-1.9F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2236F, 2.3653F, 0.7011F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition cube_r366 = rightarm2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(16, 158).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, 8.4042F, 1.2858F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r367 = rightarm2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(156, 5).addBox(-1.9F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 6.3599F, 0.4917F, -1.5708F, 1.5184F, -1.5708F));

		PartDefinition cube_r368 = rightarm2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(77, 151).addBox(-0.9F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0122F, 11.9807F, 2.4143F, 1.5708F, 1.2217F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3688F, 15.4626F, 0.8819F, 0.3817F, 0.0972F, -0.0079F));

		PartDefinition cube_r369 = rightArm3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(22, 138).addBox(-1.4998F, 0.0182F, -0.491F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.2177F, 0.0096F, 0.0084F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(145, 6).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0053F, 2.8459F, -0.09F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r370 = rightArm4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(97, 169).addBox(-0.4003F, -1.0456F, 0.5234F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9423F, 0.5743F, -1.0437F, 0.0735F, -0.8158F, -0.1714F));

		PartDefinition cube_r371 = rightArm4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(171, 125).addBox(-0.2947F, -4.4031F, -0.3039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2368F, 4.2008F, 0.0357F, -0.0322F, 0.8321F, 0.01F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1868F, 3.0324F, -0.5738F, 0.2179F, 0.0131F, -0.0416F));

		PartDefinition cube_r372 = rightArm5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(165, 25).addBox(-1.6863F, -0.0065F, -0.1801F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.2F, -2.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r373 = rightArm5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(45, 156).addBox(-0.3435F, 2.6682F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.129F, -3.2649F, -0.4055F, 0.9497F, -0.8301F, -0.1502F));

		PartDefinition cube_r374 = rightArm5.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(127, 138).addBox(-0.335F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0501F, 0.3617F, 0.6739F, 1.0314F, 0.7945F, 0.0728F));

		PartDefinition cube_r375 = rightArm5.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(30, 109).addBox(-1.6876F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -0.4F, 0.9163F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5739F, -0.4211F, -5.5307F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r376 = bone2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(35, 0).addBox(-0.1F, -2.5F, -3.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5903F, 6.5632F, -1.4802F, 0.9307F, 0.4605F, -0.3731F));

		PartDefinition cube_r377 = bone2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(43, 117).addBox(-1.1F, -2.2F, -3.65F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3291F, 2.6845F, 5.6232F, -0.0793F, 0.5726F, -0.4181F));

		PartDefinition cube_r378 = bone2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -3.9F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7582F, 3.407F, 1.7953F, 0.1993F, 0.6611F, -0.4603F));

		PartDefinition cube_r379 = bone2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(130, 40).addBox(-1.1081F, 1.7195F, 2.5139F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3779F, 0.5543F, -0.5047F));

		PartDefinition cube_r380 = bone2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 99).addBox(-1.2496F, -4.508F, 0.8203F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6886F, 0.5425F, -0.3855F));

		PartDefinition cube_r381 = bone2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 18).addBox(-1.9506F, 0.0434F, -8.6572F, 5.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0272F, -0.4817F, -2.1938F, 0.5751F, 0.995F, -1.1442F));

		PartDefinition cube_r382 = bone2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(15, 90).addBox(-1.448F, -5.1446F, 1.9073F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.014F))
				.texOffs(0, 60).addBox(-1.4579F, -5.1223F, -4.1155F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6202F, 0.1979F, -0.2842F));

		PartDefinition cube_r383 = bone2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(121, 23).addBox(-0.5F, -1.8F, -3.7F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-3.2894F, -7.8896F, 0.7423F, 0.6167F, 0.4379F, -0.3946F));

		PartDefinition cube_r384 = bone2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(166, 169).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.6046F, -8.0124F, -1.2296F, -0.0466F, 0.1979F, -0.2842F));

		PartDefinition cube_r385 = bone2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(116, 56).addBox(-0.5F, -1.0F, -1.85F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.7917F, -7.2169F, -3.2381F, 0.6515F, 0.1979F, -0.2842F));

		PartDefinition cube_r386 = bone2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(64, 7).addBox(-0.5F, -4.2F, -4.5F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1507F, 4.8419F, -1.177F, 1.402F, 0.1979F, -0.2842F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5739F, -0.4211F, -5.5307F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r387 = bone5.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-0.9F, -2.5F, -3.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5903F, 6.5632F, -1.4802F, 0.9307F, -0.4605F, 0.3731F));

		PartDefinition cube_r388 = bone5.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(43, 117).mirror().addBox(0.1F, -2.2F, -3.65F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3291F, 2.6845F, 5.6232F, -0.0793F, -0.5726F, 0.4181F));

		PartDefinition cube_r389 = bone5.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -3.9F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7582F, 3.407F, 1.7953F, 0.1993F, -0.6611F, 0.4603F));

		PartDefinition cube_r390 = bone5.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(130, 40).mirror().addBox(0.1081F, 1.7195F, 2.5139F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3779F, -0.5543F, 0.5047F));

		PartDefinition cube_r391 = bone5.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(0.2496F, -4.508F, 0.8203F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6886F, -0.5425F, 0.3855F));

		PartDefinition cube_r392 = bone5.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-3.0494F, 0.0434F, -8.6572F, 5.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0272F, -0.4817F, -2.1938F, 0.5751F, -0.995F, 1.1442F));

		PartDefinition cube_r393 = bone5.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(0.448F, -5.1446F, 1.9073F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(0.4579F, -5.1223F, -4.1155F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6202F, -0.1979F, 0.2842F));

		PartDefinition cube_r394 = bone5.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(121, 23).mirror().addBox(-0.5F, -1.8F, -3.7F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(3.2894F, -7.8896F, 0.7423F, 0.6167F, -0.4379F, 0.3946F));

		PartDefinition cube_r395 = bone5.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(166, 169).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.6046F, -8.0124F, -1.2296F, -0.0466F, -0.1979F, 0.2842F));

		PartDefinition cube_r396 = bone5.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(116, 56).mirror().addBox(-0.5F, -1.0F, -1.85F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.7917F, -7.2169F, -3.2381F, 0.6515F, -0.1979F, 0.2842F));

		PartDefinition cube_r397 = bone5.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(64, 7).mirror().addBox(-0.5F, -4.2F, -4.5F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1507F, 4.8419F, -1.177F, 1.402F, -0.1979F, 0.2842F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8613F, -10.4252F, 0.1554F, -0.302F, -0.0466F));

		PartDefinition cube_r398 = neck2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(174, 20).mirror().addBox(-1.0F, 0.0F, -2.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(173, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.085F, -0.8213F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r399 = neck2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(174, 20).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(173, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.085F, -0.8213F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r400 = neck2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(9, 160).addBox(0.0F, -8.5379F, -0.2161F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8454F, -3.0433F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r401 = neck2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(138, 151).addBox(0.0F, -10.741F, 0.1309F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8454F, -1.3433F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r402 = neck2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(66, 109).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0555F, -4.0196F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4378F, -4.1064F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r403 = neck.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(174, 3).addBox(0.0F, -4.0677F, 0.0678F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2899F, -2.8238F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r404 = neck.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(66, 72).addBox(0.0F, -5.125F, -0.1131F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5899F, -0.6238F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r405 = neck.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(173, 154).mirror().addBox(-1.5957F, 0.0446F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2594F, -2.5017F, -0.25F, 0.0452F, -0.6804F));

		PartDefinition cube_r406 = neck.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(173, 135).mirror().addBox(-1.0931F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3406F, 1.4983F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r407 = neck.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(173, 154).addBox(-0.4043F, 0.0446F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2594F, -2.5017F, -0.25F, -0.0452F, 0.6804F));

		PartDefinition cube_r408 = neck.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(173, 135).addBox(-0.9069F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3406F, 1.4983F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r409 = neck.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(69, 130).addBox(-1.0F, -1.1F, 0.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -3.5F, -0.3157F, -0.077F, 0.0411F));

		PartDefinition cube_r410 = neck3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(78, 117).addBox(0.0F, -3.2131F, -0.0836F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0899F, -1.6238F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r411 = neck3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(17, 68).mirror().addBox(-1.1957F, 0.2446F, -2.8954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4406F, 0.9983F, -0.25F, 0.0452F, -0.6804F));

		PartDefinition cube_r412 = neck3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(17, 68).addBox(-0.8043F, 0.2446F, -2.8954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4406F, 0.9983F, -0.25F, -0.0452F, 0.6804F));

		PartDefinition cube_r413 = neck3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(9, 132).addBox(-1.0F, -1.1F, 0.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5771F, -3.7265F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r414 = neck4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(86, 146).addBox(-1.0F, -1.1F, -2.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r415 = neck4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(17, 60).addBox(0.0F, -5.4F, 2.8F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.8F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6293F, -3.3838F, -0.7755F, -0.3098F, -0.1246F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(87, 141).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9517F, -0.7069F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(60, 0).addBox(-4.5F, -1.1F, -2.6F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8957F, -0.624F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(58, 30).addBox(-3.0F, 0.4F, -2.6F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8997F, -4.1256F, 0.9675F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(102, 87).addBox(-2.0F, 2.9764F, -0.0007F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.0353F, -8.479F, 1.4836F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(13, 112).addBox(-2.0F, -6.0236F, 0.9993F, 6.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, 8.6339F, -1.7671F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(28, 81).addBox(-2.0F, 1.9764F, -3.0007F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 5.0353F, -8.479F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(102, 31).addBox(-2.5F, 0.5764F, -2.0007F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.4261F, -8.6882F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(80, 68).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.401F, -7.9479F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(0, 113).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9967F, -8.0526F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(85, 78).addBox(-3.5F, -1.0F, -1.8F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(162, 0).addBox(-1.5F, -1.075F, 0.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 58).addBox(-3.0F, -1.0F, 0.2F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.722F, -9.7447F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 32).addBox(-2.5F, -0.0076F, -7.9546F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, -4.704F, -2.7143F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(85, 0).addBox(-2.5F, -0.0076F, -3.9546F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.3054F, -4.6218F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(104, 7).addBox(-3.0F, -1.375F, -1.4F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0232F, -6.3306F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(141, 89).addBox(-2.0F, -0.0076F, -0.9546F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.4363F, -7.6189F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(61, 137).addBox(-1.5F, 0.0924F, -0.5546F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7714F, -10.5851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(144, 145).addBox(-2.0F, -0.1076F, -0.0546F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7714F, -10.5851F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(130, 89).mirror().addBox(-1.5F, -2.0F, -1.4F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 7.3225F, -9.0257F, 1.8702F, 0.0927F, -0.2914F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(30, 116).mirror().addBox(-1.5F, -2.0F, -2.4F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 7.3225F, -9.0257F, 1.8827F, -0.0268F, 0.083F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(30, 116).addBox(-0.5F, -2.0F, -2.4F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3F, 7.3225F, -9.0257F, 1.8827F, 0.0268F, -0.083F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(130, 89).addBox(0.5F, -2.0F, -1.4F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 7.3225F, -9.0257F, 1.8702F, -0.0927F, 0.2914F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(47, 83).addBox(-2.0F, -0.0236F, -4.0007F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.0276F, -11.5221F, 1.8838F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(47, 92).addBox(-3.0F, -0.0236F, -2.0007F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 4.0427F, -11.2762F, 1.4475F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(29, 32).addBox(-3.0F, -5.5F, -7.7F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.688F, 0.4731F, 0.1298F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(140, 61).addBox(-2.0F, -0.3F, -0.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.115F, -5.668F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(81, 26).addBox(-2.0F, -3.025F, 0.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 9.8973F, -0.6627F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(102, 24).addBox(-2.0F, -2.125F, -1.6F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 9.731F, -2.3187F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offset(1.8F, 13.0406F, -6.613F));

		PartDefinition cube_r442 = leftTusk.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(54, 45).addBox(-1.5F, -2.6731F, -0.7075F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4911F, 0.0F, -0.096F));

		PartDefinition cube_r443 = leftTusk.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 75).addBox(-1.5F, -2.8896F, -0.0515F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7966F, 0.0F, -0.096F));

		PartDefinition cube_r444 = leftTusk.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(136, 120).addBox(-0.8607F, -0.1532F, -3.5044F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(4.5362F, 28.4549F, -30.6256F, -1.2925F, 0.7567F, -0.1048F));

		PartDefinition cube_r445 = leftTusk.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(74, 137).addBox(-0.8607F, -0.7849F, -3.5115F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5362F, 28.4549F, -30.6256F, -1.2052F, 0.7567F, -0.1048F));

		PartDefinition cube_r446 = leftTusk.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(35, 133).addBox(-0.8607F, 0.4419F, -3.4724F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5362F, 28.4549F, -30.6256F, -1.4234F, 0.7567F, -0.1048F));

		PartDefinition cube_r447 = leftTusk.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(104, 136).addBox(-0.8677F, -0.6873F, -0.5035F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(4.5362F, 28.4549F, -30.6256F, -0.819F, 0.6891F, -0.058F));

		PartDefinition cube_r448 = leftTusk.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(35, 126).addBox(-0.8677F, -0.5053F, -0.3941F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5362F, 28.4549F, -30.6256F, -0.9063F, 0.6891F, -0.058F));

		PartDefinition cube_r449 = leftTusk.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(64, 100).addBox(-1.0169F, -0.3087F, -5.954F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(10.586F, 34.0805F, -23.8572F, -0.449F, 0.6738F, -0.1065F));

		PartDefinition cube_r450 = leftTusk.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(127, 59).addBox(-1.0F, -2.9F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.5035F, 32.4966F, -29.9484F, -0.7981F, 0.6738F, -0.1065F));

		PartDefinition cube_r451 = leftTusk.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(127, 52).addBox(-1.0F, -2.2F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(5.5035F, 32.4966F, -29.9484F, -0.8853F, 0.6738F, -0.1065F));

		PartDefinition cube_r452 = leftTusk.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(101, 67).addBox(4.9831F, -2.6788F, -0.0171F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 35.4075F, -25.1534F, -0.449F, 0.6738F, -0.1065F));

		PartDefinition cube_r453 = leftTusk.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(100, 98).addBox(8.2134F, 0.6395F, -0.3434F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.9652F, 35.4075F, -20.1534F, -0.2545F, 0.4601F, -0.1885F));

		PartDefinition cube_r454 = leftTusk.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(104, 78).addBox(8.2134F, -0.1591F, -0.5071F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 35.4075F, -20.1534F, -0.1759F, 0.4601F, -0.1885F));

		PartDefinition cube_r455 = leftTusk.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(47, 100).addBox(11.2116F, 2.2309F, -7.4224F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F))
				.texOffs(30, 100).addBox(11.2116F, 3.4309F, -7.4224F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 33.0075F, -10.5534F, 0.0764F, 0.2773F, -0.1696F));

		PartDefinition cube_r456 = leftTusk.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(13, 103).addBox(10.6356F, 2.6071F, -5.3976F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F))
				.texOffs(99, 58).addBox(10.6356F, 1.2071F, -5.7976F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 33.0075F, -10.5534F, 0.3285F, 0.1065F, -0.2063F));

		PartDefinition cube_r457 = leftTusk.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(106, 14).addBox(7.5403F, -0.0595F, -12.8126F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.9652F, 28.1075F, -3.0534F, 0.6533F, -0.12F, -0.3377F));

		PartDefinition cube_r458 = leftTusk.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(30, 90).addBox(7.5403F, 1.4443F, -12.6168F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 28.1075F, -3.0534F, 0.566F, -0.12F, -0.3377F));

		PartDefinition cube_r459 = leftTusk.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(85, 87).addBox(7.0532F, -1.0185F, -8.5416F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 28.1075F, -3.0534F, 0.816F, -0.1442F, -0.4065F));

		PartDefinition cube_r460 = leftTusk.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(111, 169).addBox(-0.5F, -2.4F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6488F, -2.6187F, 6.5859F, 1.1206F, 0.0781F, -0.0072F));

		PartDefinition cube_r461 = leftTusk.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(104, 169).addBox(-0.4F, -1.1F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.297F, -2.5142F, 4.3206F, 0.3909F, 0.1478F, 0.0932F));

		PartDefinition cube_r462 = leftTusk.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(66, 79).addBox(-1.3302F, 2.1912F, -16.0583F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 14.6075F, 0.5466F, 1.0663F, -0.2582F, -0.5221F));

		PartDefinition cube_r463 = leftTusk.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(28, 70).addBox(-0.4663F, -0.2584F, -11.5661F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 14.6075F, 0.5466F, 1.2701F, -0.2209F, -0.45F));

		PartDefinition cube_r464 = leftTusk.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(47, 72).addBox(0.0799F, -2.2043F, -6.5967F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 14.6075F, 0.5466F, 1.5387F, -0.2676F, -0.3624F));

		PartDefinition cube_r465 = leftTusk.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(29, 45).addBox(-1.9354F, -2.1586F, -8.7151F, 3.0F, 4.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9652F, 6.6075F, 0.5466F, 1.6117F, -0.0867F, -0.2799F));

		PartDefinition cube_r466 = leftTusk.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(48, 59).addBox(-1.5F, -2.9012F, -6.7726F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6649F, 0.0124F, -0.2263F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offset(-1.8F, 13.0406F, -6.613F));

		PartDefinition cube_r467 = rightTusk.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(54, 45).mirror().addBox(-1.5F, -2.6731F, -0.7075F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4911F, 0.0F, 0.096F));

		PartDefinition cube_r468 = rightTusk.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-1.5F, -2.8896F, -0.0515F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7966F, 0.0F, 0.096F));

		PartDefinition cube_r469 = rightTusk.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(136, 120).mirror().addBox(-1.1393F, -0.1532F, -3.5044F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-4.5362F, 28.4549F, -30.6256F, -1.2925F, -0.7567F, 0.1048F));

		PartDefinition cube_r470 = rightTusk.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(74, 137).mirror().addBox(-1.1393F, -0.7849F, -3.5115F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5362F, 28.4549F, -30.6256F, -1.2052F, -0.7567F, 0.1048F));

		PartDefinition cube_r471 = rightTusk.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(35, 133).mirror().addBox(-1.1393F, 0.4419F, -3.4724F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5362F, 28.4549F, -30.6256F, -1.4234F, -0.7567F, 0.1048F));

		PartDefinition cube_r472 = rightTusk.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(104, 136).mirror().addBox(-1.1323F, -0.6873F, -0.5035F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-4.5362F, 28.4549F, -30.6256F, -0.819F, -0.6891F, 0.058F));

		PartDefinition cube_r473 = rightTusk.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(35, 126).mirror().addBox(-1.1323F, -0.5053F, -0.3941F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5362F, 28.4549F, -30.6256F, -0.9063F, -0.6891F, 0.058F));

		PartDefinition cube_r474 = rightTusk.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(64, 100).mirror().addBox(-0.9831F, -0.3087F, -5.954F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-10.586F, 34.0805F, -23.8572F, -0.449F, -0.6738F, 0.1065F));

		PartDefinition cube_r475 = rightTusk.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(127, 59).mirror().addBox(-1.0F, -2.9F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.5035F, 32.4966F, -29.9484F, -0.7981F, -0.6738F, 0.1065F));

		PartDefinition cube_r476 = rightTusk.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(127, 52).mirror().addBox(-1.0F, -2.2F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-5.5035F, 32.4966F, -29.9484F, -0.8853F, -0.6738F, 0.1065F));

		PartDefinition cube_r477 = rightTusk.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(101, 67).mirror().addBox(-6.9831F, -2.6788F, -0.0171F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 35.4075F, -25.1534F, -0.449F, -0.6738F, 0.1065F));

		PartDefinition cube_r478 = rightTusk.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(100, 98).mirror().addBox(-10.2134F, 0.6395F, -0.3434F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 35.4075F, -20.1534F, -0.2545F, -0.4601F, 0.1885F));

		PartDefinition cube_r479 = rightTusk.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(104, 78).mirror().addBox(-10.2134F, -0.1591F, -0.5071F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 35.4075F, -20.1534F, -0.1759F, -0.4601F, 0.1885F));

		PartDefinition cube_r480 = rightTusk.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(47, 100).mirror().addBox(-13.2116F, 2.2309F, -7.4224F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(30, 100).mirror().addBox(-13.2116F, 3.4309F, -7.4224F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 33.0075F, -10.5534F, 0.0764F, -0.2773F, 0.1696F));

		PartDefinition cube_r481 = rightTusk.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(13, 103).mirror().addBox(-12.6356F, 2.6071F, -5.3976F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(99, 58).mirror().addBox(-12.6356F, 1.2071F, -5.7976F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 33.0075F, -10.5534F, 0.3285F, -0.1065F, 0.2063F));

		PartDefinition cube_r482 = rightTusk.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(106, 14).mirror().addBox(-9.5403F, -0.0595F, -12.8126F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 28.1075F, -3.0534F, 0.6533F, 0.12F, 0.3377F));

		PartDefinition cube_r483 = rightTusk.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(30, 90).mirror().addBox(-9.5403F, 1.4443F, -12.6168F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 28.1075F, -3.0534F, 0.566F, 0.12F, 0.3377F));

		PartDefinition cube_r484 = rightTusk.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(85, 87).mirror().addBox(-9.0532F, -1.0185F, -8.5416F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 28.1075F, -3.0534F, 0.816F, 0.1442F, 0.4065F));

		PartDefinition cube_r485 = rightTusk.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(111, 169).mirror().addBox(-0.5F, -2.4F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.6488F, -2.6187F, 6.5859F, 1.1206F, -0.0781F, 0.0072F));

		PartDefinition cube_r486 = rightTusk.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(104, 169).mirror().addBox(-0.6F, -1.1F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.297F, -2.5142F, 4.3206F, 0.3909F, -0.1478F, -0.0932F));

		PartDefinition cube_r487 = rightTusk.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(66, 79).mirror().addBox(-1.6698F, 2.1912F, -16.0583F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 14.6075F, 0.5466F, 1.0663F, 0.2582F, 0.5221F));

		PartDefinition cube_r488 = rightTusk.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(28, 70).mirror().addBox(-2.5337F, -0.2584F, -11.5661F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 14.6075F, 0.5466F, 1.2701F, 0.2209F, 0.45F));

		PartDefinition cube_r489 = rightTusk.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(47, 72).mirror().addBox(-3.0799F, -2.2043F, -6.5967F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 14.6075F, 0.5466F, 1.5387F, 0.2676F, 0.3624F));

		PartDefinition cube_r490 = rightTusk.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(29, 45).mirror().addBox(-1.0646F, -2.1586F, -8.7151F, 3.0F, 4.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9652F, 6.6075F, 0.5466F, 1.6117F, 0.0867F, 0.2799F));

		PartDefinition cube_r491 = rightTusk.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(48, 59).mirror().addBox(-1.5F, -2.9012F, -6.7726F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6649F, -0.0124F, 0.2263F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2052F, 11.0294F, -10.3157F, -0.7869F, -0.2186F, -0.0975F));

		PartDefinition cube_r492 = leftOrbit.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(134, 7).addBox(-1.0F, -3.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2211F, -5.7142F, -4.7103F, 2.0669F, 1.0275F, 1.3896F));

		PartDefinition cube_r493 = leftOrbit.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(119, 90).addBox(-0.8F, 0.0F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1653F, -4.4995F, -3.9722F, 1.9436F, 0.8291F, 1.2365F));

		PartDefinition cube_r494 = leftOrbit.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(56, 173).addBox(-0.5F, -0.75F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5922F, -3.7577F, -2.7754F, 2.8403F, 0.4195F, 1.1956F));

		PartDefinition cube_r495 = leftOrbit.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(154, 171).addBox(-0.5F, -0.75F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5922F, -3.7577F, -2.7754F, 3.0585F, 0.4195F, 1.1956F));

		PartDefinition cube_r496 = leftOrbit.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(160, 49).addBox(-0.6F, -1.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0849F, -3.5697F, -0.8737F, -2.8326F, 0.1283F, 0.9517F));

		PartDefinition cube_r497 = leftOrbit.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(24, 168).addBox(-0.3597F, -2.9582F, -0.7209F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, -2.593F, 0.0593F, 0.7698F));

		PartDefinition cube_r498 = leftOrbit.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(91, 123).addBox(-1.0155F, -3.8131F, 0.3773F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1218F, -8.7025F, 0.2284F, -2.9025F, 0.0558F, 0.3091F));

		PartDefinition cube_r499 = leftOrbit.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(83, 14).addBox(-1.0155F, -4.0598F, -0.5587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1218F, -8.7025F, 0.2284F, -3.0771F, 0.0558F, 0.3091F));

		PartDefinition cube_r500 = leftOrbit.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(152, 72).addBox(-1.2F, -0.8F, -1.825F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2708F, -14.0667F, -1.0701F, 3.0555F, 0.0961F, 0.8205F));

		PartDefinition cube_r501 = leftOrbit.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(169, 47).addBox(-0.9269F, -5.5359F, -1.5648F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.875F, -13.7519F, -1.2151F, -3.0596F, 0.0558F, 0.3614F));

		PartDefinition cube_r502 = leftOrbit.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(141, 168).addBox(-0.9329F, -3.1559F, -1.9181F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.875F, -13.7519F, -1.2151F, 3.0883F, 0.0558F, 0.3614F));

		PartDefinition cube_r503 = leftOrbit.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(169, 28).addBox(-0.9329F, -3.0484F, -1.2677F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.875F, -13.7519F, -1.2151F, -2.9767F, 0.0558F, 0.3614F));

		PartDefinition cube_r504 = leftOrbit.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(61, 173).addBox(-0.3078F, 0.2472F, 0.2947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, 2.9261F, 0.018F, 0.5164F));

		PartDefinition cube_r505 = leftOrbit.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(69, 173).addBox(-0.4286F, -1.0485F, 0.0497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, -2.9165F, 0.0809F, 0.8046F));

		PartDefinition cube_r506 = leftOrbit.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(173, 61).addBox(-0.4286F, -0.6889F, -0.882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, -2.9601F, 0.0809F, 0.8046F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2052F, 11.0294F, -10.3157F, -0.7869F, 0.2186F, 0.0975F));

		PartDefinition cube_r507 = rightOrbit.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(134, 7).mirror().addBox(0.0F, -3.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2211F, -5.7142F, -4.7103F, 2.0669F, -1.0275F, -1.3896F));

		PartDefinition cube_r508 = rightOrbit.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(119, 90).mirror().addBox(-0.2F, 0.0F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1653F, -4.4995F, -3.9722F, 1.9436F, -0.8291F, -1.2365F));

		PartDefinition cube_r509 = rightOrbit.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(56, 173).mirror().addBox(-0.5F, -0.75F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5922F, -3.7577F, -2.7754F, 2.8403F, -0.4195F, -1.1956F));

		PartDefinition cube_r510 = rightOrbit.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(154, 171).mirror().addBox(-0.5F, -0.75F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5922F, -3.7577F, -2.7754F, 3.0585F, -0.4195F, -1.1956F));

		PartDefinition cube_r511 = rightOrbit.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(160, 49).mirror().addBox(-0.4F, -1.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0849F, -3.5697F, -0.8737F, -2.8326F, -0.1283F, -0.9517F));

		PartDefinition cube_r512 = rightOrbit.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(24, 168).mirror().addBox(-0.6403F, -2.9582F, -0.7209F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, -2.593F, -0.0593F, -0.7698F));

		PartDefinition cube_r513 = rightOrbit.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(91, 123).mirror().addBox(0.0155F, -3.8131F, 0.3773F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1218F, -8.7025F, 0.2284F, -2.9025F, -0.0558F, -0.3091F));

		PartDefinition cube_r514 = rightOrbit.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(0.0155F, -4.0598F, -0.5587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1218F, -8.7025F, 0.2284F, -3.0771F, -0.0558F, -0.3091F));

		PartDefinition cube_r515 = rightOrbit.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(152, 72).mirror().addBox(-0.8F, -0.8F, -1.825F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2708F, -14.0667F, -1.0701F, 3.0555F, -0.0961F, -0.8205F));

		PartDefinition cube_r516 = rightOrbit.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(169, 47).mirror().addBox(-0.0731F, -5.5359F, -1.5648F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.875F, -13.7519F, -1.2151F, -3.0596F, -0.0558F, -0.3614F));

		PartDefinition cube_r517 = rightOrbit.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(141, 168).mirror().addBox(-0.0671F, -3.1559F, -1.9181F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.875F, -13.7519F, -1.2151F, 3.0883F, -0.0558F, -0.3614F));

		PartDefinition cube_r518 = rightOrbit.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(169, 28).mirror().addBox(-0.0671F, -3.0484F, -1.2677F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.875F, -13.7519F, -1.2151F, -2.9767F, -0.0558F, -0.3614F));

		PartDefinition cube_r519 = rightOrbit.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(61, 173).mirror().addBox(-0.6922F, 0.2472F, 0.2947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, 2.9261F, -0.018F, -0.5164F));

		PartDefinition cube_r520 = rightOrbit.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(69, 173).mirror().addBox(-0.5714F, -1.0485F, 0.0497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, -2.9165F, -0.0809F, -0.8046F));

		PartDefinition cube_r521 = rightOrbit.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(173, 61).mirror().addBox(-0.5714F, -0.6889F, -0.882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, -2.9601F, -0.0809F, -0.8046F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.7742F, -4.3845F, -2.4985F));

		PartDefinition cube_r522 = bone3.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(100, 142).addBox(-2.0F, -3.0F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1976F, 0.2793F, -0.2145F));

		PartDefinition cube_r523 = bone3.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(141, 104).addBox(-2.0F, -3.0F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7258F, 2.3247F, 1.7518F, 0.6313F, 0.1461F, -0.1966F));

		PartDefinition cube_r524 = bone3.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(53, 169).addBox(-0.25F, -0.625F, -0.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-3.2742F, 5.7822F, -7.3761F, 1.2654F, 0.1719F, 0.4971F));

		PartDefinition cube_r525 = bone3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(168, 144).addBox(-0.1F, -0.625F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.2742F, 5.7822F, -7.3761F, 1.3189F, 0.2443F, 0.7543F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.7742F, -4.3845F, -2.4985F));

		PartDefinition cube_r526 = bone4.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(100, 142).mirror().addBox(0.0F, -3.0F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1976F, -0.2793F, 0.2145F));

		PartDefinition cube_r527 = bone4.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(141, 104).mirror().addBox(0.0F, -3.0F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7258F, 2.3247F, 1.7518F, 0.6313F, -0.1461F, 0.1966F));

		PartDefinition cube_r528 = bone4.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(53, 169).mirror().addBox(-1.75F, -0.625F, -0.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(3.2742F, 5.7822F, -7.3761F, 1.2654F, -0.1719F, -0.4971F));

		PartDefinition cube_r529 = bone4.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(168, 144).mirror().addBox(-1.9F, -0.625F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(3.2742F, 5.7822F, -7.3761F, 1.3189F, -0.2443F, -0.7543F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(160, 120).addBox(2.5F, 1.4F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F))
				.texOffs(122, 141).addBox(2.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(160, 120).mirror().addBox(-4.7F, 1.4F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(122, 141).mirror().addBox(-4.7F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.9111F, -0.5479F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(172, 71).mirror().addBox(-1.0F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6682F, 3.9317F, -6.6504F, -1.508F, -0.1207F, -0.0209F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(153, 15).mirror().addBox(-0.5F, -0.1688F, -2.9673F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(153, 15).addBox(6.7F, -0.1688F, -2.9673F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.2F, 5.4285F, -0.5125F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 161).mirror().addBox(-2.6F, -0.1379F, -1.4552F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(0, 161).addBox(4.6F, -0.1379F, -1.4552F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.1F, 6.0606F, -2.9363F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(141, 155).mirror().addBox(-0.9869F, 0.0622F, -0.0456F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3061F, 4.3037F, -10.0461F, -0.9653F, -0.5321F, -0.129F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(141, 155).mirror().addBox(-0.9869F, -0.7378F, -2.0456F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3929F, 6.3588F, -7.0737F, -1.5889F, -0.349F, 0.0024F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(118, 67).mirror().addBox(-0.675F, -1.3F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9209F, 6.1062F, -5.4539F, -1.4885F, -0.1543F, -0.0484F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(174, 42).mirror().addBox(-0.5F, -2.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, 7.1154F, -13.7953F, -1.6144F, -0.2182F, -0.0436F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(24, 174).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7928F, 7.1154F, -13.7953F, -1.0908F, -0.2182F, -0.0436F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(83, 172).mirror().addBox(-0.4815F, -0.7989F, -0.7427F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7117F, 5.2076F, -11.2634F, -0.7102F, -0.3883F, -0.0264F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(157, 42).mirror().addBox(-0.5189F, -2.6757F, -0.6935F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7117F, 5.2076F, -11.2634F, -0.6294F, -0.5586F, 0.2146F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(161, 156).mirror().addBox(-0.2F, -3.6F, -1.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0887F, 7.3815F, -13.1106F, -1.6316F, -0.5004F, -0.1137F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(151, 161).mirror().addBox(-1.0134F, -1.8799F, -1.4919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9026F, 4.6451F, -9.9588F, -2.1701F, -0.5761F, 0.2367F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(152, 77).mirror().addBox(-0.9956F, -0.682F, -0.2162F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.3929F, 6.3588F, -7.0737F, -1.6239F, -0.3412F, -0.125F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(169, 83).mirror().addBox(-0.5F, -1.9904F, -1.9586F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(169, 83).addBox(6.7F, -1.9904F, -1.9586F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.2F, 4.3784F, 1.4536F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(117, 174).mirror().addBox(-0.5F, -1.5507F, -1.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 174).addBox(6.7F, -1.5507F, -1.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 6.4575F, 1.2983F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(152, 104).mirror().addBox(-0.5F, -0.2493F, -4.5934F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(152, 104).addBox(6.7F, -0.2493F, -4.5934F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.2F, 5.7364F, -1.6507F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(173, 131).mirror().addBox(-0.5F, -0.7F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(173, 131).addBox(6.7F, -0.7F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 0.8507F, -0.3197F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(172, 37).mirror().addBox(-0.5F, -0.9F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(172, 37).addBox(6.7F, -0.9F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.2F, 0.7F, 0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(173, 115).mirror().addBox(-0.5F, 0.3F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(173, 115).addBox(6.7F, 0.3F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.2F, 0.7F, 0.7F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(160, 138).mirror().addBox(-1.0F, 0.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(160, 138).addBox(6.2F, 0.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.7F, 0.969F, -3.2436F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(74, 173).mirror().addBox(-1.0F, 1.7569F, -0.3171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(74, 173).addBox(6.2F, 1.7569F, -0.3171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.7F, 1.0739F, -5.8029F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(152, 94).mirror().addBox(-0.5F, 0.9F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(152, 94).addBox(6.7F, 0.9F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.2F, -0.0651F, -4.6564F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(140, 51).mirror().addBox(-0.5F, -1.8F, -1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(140, 51).addBox(6.7F, -1.8F, -1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.2F, 5.0865F, -1.1026F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(86, 152).mirror().addBox(-0.5F, -3.3001F, -0.9595F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 152).addBox(6.7F, -3.3001F, -0.9595F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 4.9575F, -0.7017F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(172, 71).addBox(0.0F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4682F, 3.9317F, -6.6504F, -1.508F, 0.1207F, 0.0209F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(141, 155).addBox(-1.0131F, 0.0622F, -0.0456F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1061F, 4.3037F, -10.0461F, -0.9653F, 0.5321F, 0.129F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(141, 155).addBox(-1.0131F, -0.7378F, -2.0456F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1929F, 6.3588F, -7.0737F, -1.5889F, 0.349F, -0.0024F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(118, 67).addBox(-1.325F, -1.3F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.7209F, 6.1062F, -5.4539F, -1.4885F, 0.1543F, 0.0484F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(174, 42).addBox(-0.5F, -2.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4072F, 7.1154F, -13.7953F, -1.6144F, 0.2182F, 0.0436F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(24, 174).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4072F, 7.1154F, -13.7953F, -1.0908F, 0.2182F, 0.0436F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(83, 172).addBox(-0.5185F, -0.7989F, -0.7427F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5117F, 5.2076F, -11.2634F, -0.7102F, 0.3883F, 0.0264F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(157, 42).addBox(-0.4811F, -2.6757F, -0.6935F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5117F, 5.2076F, -11.2634F, -0.6294F, 0.5586F, -0.2146F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(161, 156).addBox(-1.8F, -3.6F, -1.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1113F, 7.3815F, -13.1106F, -1.6316F, 0.5004F, 0.1137F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(151, 161).addBox(0.0134F, -1.8799F, -1.4919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7026F, 4.6451F, -9.9588F, -2.1701F, 0.5761F, -0.2367F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(152, 77).addBox(-1.0044F, -0.682F, -0.2162F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.1929F, 6.3588F, -7.0737F, -1.6239F, 0.3412F, 0.125F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(98, 42).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(90, 165).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 174).addBox(0.0F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0726F, 2.7644F, -0.8018F, 0.122F, -0.1251F));

		PartDefinition cube_r565 = tail.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(164, 174).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r566 = tail.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(145, 174).addBox(0.0F, -2.2F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 3.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(81, 115).addBox(-0.5F, -0.5182F, -0.047F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(170, 174).addBox(0.0F, -1.8182F, 2.953F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3617F, 6.8924F, -0.3924F, 0.2021F, -0.0829F));

		PartDefinition cube_r567 = tail2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(40, 175).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3182F, 4.953F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r568 = tail2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(167, 174).addBox(0.0F, -1.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3182F, 1.753F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(115, 42).addBox(-0.5F, -0.5864F, -0.0965F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(148, 72).addBox(0.0F, -1.2864F, 0.9035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 175).addBox(0.0F, -1.2864F, 2.9035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 175).addBox(0.0F, -1.0864F, 4.9035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0855F, 5.8481F, -0.414F, 0.2406F, -0.1043F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(130, 75).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0076F, 5.7226F, 0.2411F, 0.212F, 0.0517F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(82, 130).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0174F, 4.9015F, 0.2526F, 0.2538F, 0.0647F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(130, 82).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.7F, 0.4368F, 0.2783F, 0.1275F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(164, 115).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.7F, 0.4456F, 0.1974F, 0.0934F));

		return LayerDefinition.create(meshdefinition, 183, 183);
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