package fossils.fossils.client.blockentity.model.sauropelta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SauropeltaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms18;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart leftleg4;
	private final ModelPart leftleg5;
	private final ModelPart leftleg6;
	private final ModelPart leftfoot3;
	private final ModelPart leftfoot4;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart backPlates3;
	private final ModelPart backPlates6;
	private final ModelPart body;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms17;
	private final ModelPart chest;
	private final ModelPart backPlates;
	private final ModelPart backPlates4;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms16;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms15;
	private final ModelPart neck2;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms14;
	private final ModelPart neck;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms13;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart backPlates2;
	private final ModelPart backPlates5;
	private final ModelPart tail;
	private final ModelPart osteoderms12;
	private final ModelPart osteoderms19;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms20;
	private final ModelPart tail2;
	private final ModelPart osteoderms8;
	private final ModelPart osteoderms21;
	private final ModelPart tail3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms22;
	private final ModelPart tail4;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms23;
	private final ModelPart tail5;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms24;

	public SauropeltaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms6 = this.hips.getChild("osteoderms6");
		this.osteoderms18 = this.hips.getChild("osteoderms18");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.leftleg4 = this.hips.getChild("leftleg4");
		this.leftleg5 = this.leftleg4.getChild("leftleg5");
		this.leftleg6 = this.leftleg5.getChild("leftleg6");
		this.leftfoot3 = this.leftleg6.getChild("leftfoot3");
		this.leftfoot4 = this.leftfoot3.getChild("leftfoot4");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.backPlates3 = this.hips.getChild("backPlates3");
		this.backPlates6 = this.hips.getChild("backPlates6");
		this.body = this.hips.getChild("body");
		this.osteoderms5 = this.body.getChild("osteoderms5");
		this.osteoderms17 = this.body.getChild("osteoderms17");
		this.chest = this.body.getChild("chest");
		this.backPlates = this.chest.getChild("backPlates");
		this.backPlates4 = this.chest.getChild("backPlates4");
		this.osteoderms4 = this.chest.getChild("osteoderms4");
		this.osteoderms16 = this.chest.getChild("osteoderms16");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.osteoderms3 = this.neck3.getChild("osteoderms3");
		this.osteoderms15 = this.neck3.getChild("osteoderms15");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms2 = this.neck2.getChild("osteoderms2");
		this.osteoderms14 = this.neck2.getChild("osteoderms14");
		this.neck = this.neck2.getChild("neck");
		this.osteoderms = this.neck.getChild("osteoderms");
		this.osteoderms13 = this.neck.getChild("osteoderms13");
		this.head = this.neck.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.backPlates5 = this.body.getChild("backPlates5");
		this.tail = this.hips.getChild("tail");
		this.osteoderms12 = this.tail.getChild("osteoderms12");
		this.osteoderms19 = this.tail.getChild("osteoderms19");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.osteoderms20 = this.tail.getChild("osteoderms20");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms8 = this.tail2.getChild("osteoderms8");
		this.osteoderms21 = this.tail2.getChild("osteoderms21");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms9 = this.tail3.getChild("osteoderms9");
		this.osteoderms22 = this.tail3.getChild("osteoderms22");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms10 = this.tail4.getChild("osteoderms10");
		this.osteoderms23 = this.tail4.getChild("osteoderms23");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms11 = this.tail5.getChild("osteoderms11");
		this.osteoderms24 = this.tail5.getChild("osteoderms24");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -18.0F, 5.8F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.8F, -2.4F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -12.6F, -13.3F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.4F, -7.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -12.6F, -13.3F, -0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-3.7F, -6.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -13.5F, 6.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -18.5F, 8.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 68).addBox(0.0F, 0.5199F, -0.5166F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(81, 81).addBox(0.0F, 0.4F, 0.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = hips.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offsetAndRotation(9.5F, -2.066F, -8.4611F, -0.3499F, -0.0656F, 0.0239F));

		PartDefinition osteoderms18 = hips.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.5F, -2.066F, -8.4611F, -0.3499F, 0.0656F, -0.0239F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4F, 1.4999F, -1.1448F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9762F, -2.3099F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, 0.288F, 0.0F, 0.0F));

		PartDefinition leftleg4 = hips.addOrReplaceChild("leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4F, 1.4999F, -1.1448F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftleg5 = leftleg4.addOrReplaceChild("leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9762F, -2.3099F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftleg6 = leftleg5.addOrReplaceChild("leftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftfoot3 = leftleg6.addOrReplaceChild("leftfoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot4 = leftfoot3.addOrReplaceChild("leftfoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0567F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4F, 1.4999F, -1.1448F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9762F, -2.3099F, 0.3578F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.2705F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0175F, 0.0F, 0.0F));

		PartDefinition backPlates3 = hips.addOrReplaceChild("backPlates3", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -2.7511F, -8.4674F, 0.0F, -0.2618F, 0.0F));

		PartDefinition backPlates6 = hips.addOrReplaceChild("backPlates6", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -2.7511F, -8.4674F, 0.0F, 0.2618F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -9.3F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 68).addBox(0.0F, 0.5082F, -0.2785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms5 = body.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0577F, -4.6722F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms17 = body.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0577F, -4.6722F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -6.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 55).addBox(-2.5354F, 0.0838F, -0.5409F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5354F, -0.1794F, 3.0144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition backPlates = chest.addOrReplaceChild("backPlates", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0293F, 5.0998F, -7.1849F, 0.0F, 0.0349F, -0.0015F));

		PartDefinition backPlates4 = chest.addOrReplaceChild("backPlates4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0293F, 5.0998F, -7.1849F, 0.0F, -0.0349F, 0.0015F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.5886F, -6.9554F, 0.1745F, 0.0F, 0.0F));

		PartDefinition osteoderms16 = chest.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.5886F, -6.9554F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3F, 7.5669F, -6.0334F, -0.0523F, -0.0008F, -0.2182F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 5.0571F, 2.3001F, -0.7904F, -0.7781F, 1.3773F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 0.9791F, 0.5331F, -0.7742F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3F, 7.5669F, -6.0334F, 0.5149F, 0.0008F, 0.2182F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 5.0571F, 2.3001F, -0.7904F, 0.7781F, -1.3773F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 0.5515F, -0.9369F, 0.7112F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -6.8F, -0.0361F, -0.2616F, 0.0094F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 82).addBox(0.0F, -0.1F, -4.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -2.2664F, -3.3527F, 0.0F, 0.1396F, 0.0F));

		PartDefinition osteoderms15 = neck3.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -2.2664F, -3.3527F, 0.0F, -0.1396F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, 0.0076F, -0.0438F, 0.0426F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 84).addBox(0.0F, 0.1F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -2.7664F, -2.2484F));

		PartDefinition osteoderms14 = neck2.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.7664F, -2.2484F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(80, 57).addBox(0.0F, 0.4781F, -0.0075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(1.6F, -1.3664F, -1.3484F));

		PartDefinition osteoderms13 = neck.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-1.6F, -1.3664F, -1.3484F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4258F, -3.8931F, 0.1816F, -0.1935F, -0.0988F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, -0.524F, -1.7014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.2594F, -5.524F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.2594F, -5.524F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.3117F, -0.1904F, 0.3578F, 0.0F, 0.0F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.7F, 4.5F, 0.9021F, -0.1586F, 0.4921F, -0.0754F));

		PartDefinition backPlates5 = body.addOrReplaceChild("backPlates5", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.7F, 4.5F, 0.9021F, -0.1586F, -0.4921F, 0.0754F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.3583F, 0.0665F, -0.0714F));

		PartDefinition osteoderms12 = tail.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -1.4664F, 9.4473F, 0.0F, 0.1396F, 0.0F));

		PartDefinition osteoderms19 = tail.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -1.4664F, 9.4473F, 0.0F, -0.1396F, 0.0F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -2.4926F, 1.8292F, -0.4189F, 0.0F, 0.0F));

		PartDefinition osteoderms20 = tail.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -2.4926F, 1.8292F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(57, 60).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0651F, 0.1771F, -0.0319F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition osteoderms21 = tail2.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(14, 55).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1311F, 0.2345F, -0.0982F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition osteoderms22 = tail3.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(26, 57).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.1046F, 0.3188F, -0.0926F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition osteoderms23 = tail4.addOrReplaceChild("osteoderms23", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.1157F, -0.8994F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0262F, 8.9999F, 0.0248F, 0.2696F, -0.162F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.2996F, 0.7751F, -0.5062F, 0.0153F, -0.0085F));

		PartDefinition osteoderms24 = tail5.addOrReplaceChild("osteoderms24", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.2996F, 0.7751F, -0.5062F, -0.0153F, 0.0085F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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